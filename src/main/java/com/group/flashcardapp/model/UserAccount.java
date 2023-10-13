package com.group.flashcardapp.model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAccount {
    private final String username;
    private String password;
    private int winstreak;
    private int points;

    public UserAccount(String username, String password) {
        this.username = username;
        this.winstreak = 0;
        this.points = 0;
        try {
            if (passwordReqCheck(password)) {
                this.password = password;
            } else {
                throw new InvalidPasswordException("This password is invalid please try again");
            }
        } catch (InvalidPasswordException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public int getWinStreak() {
        return this.winstreak;
    }

    public int increaseWinStreak() {
        this.winstreak++;
        return this.winstreak;
    }

    public int clearWinStreak() {
        this.winstreak = 0;
        return this.winstreak;
    }

    public int convertToPoints(){
        this.points = winstreak*1000;
        return this.points;
    }

    public boolean changePassword(String newpass) {
        if (this.password.equals(newpass)) {
            return false;
        } else if (passwordReqCheck(newpass)) {
            this.password = newpass;
            return true;
        }
        return true;
    }

    public boolean passwordReqCheck(String password) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(password);
        return matcher.matches();
    }
}
