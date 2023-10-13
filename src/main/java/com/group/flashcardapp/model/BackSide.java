package com.group.flashcardapp.model;

import javafx.scene.image.Image;

public class BackSide extends CardSide {

    public BackSide() {
        super();
    }
    public BackSide(String text, Image image) {
        super(text, image);
    }

    public BackSide(Image image) {
        super(image);
    }

    public BackSide(String text) {
        super(text);
    }

}
