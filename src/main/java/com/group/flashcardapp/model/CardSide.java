package com.group.flashcardapp.model;

import javafx.scene.image.Image;

public class CardSide {
    private String text;
    private Image image;

    public CardSide() {
    }

    public CardSide(String text, Image image) {
        this.text = text;
        this.image = image;
    }

    public CardSide(Image image) {
        this.image = image;
    }

    public CardSide(String text) {
        this.text = text;
    }
}
