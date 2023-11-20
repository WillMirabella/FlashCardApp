package com.group.flashcardapp.model;

public class TextSide implements CardSide {
    private String text;

    public TextSide(String text) {
        this.text = text;
    }

    @Override
    public String getPath() {
        return "cardSides.textSide.fxml";
    }

    public String getText() {
        return this.text;
    }
}
