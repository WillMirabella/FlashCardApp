package com.group.flashcardapp.model;

import javafx.scene.image.Image;

public class FrontSide extends CardSide {

    public FrontSide() {
        super();
    }
    public FrontSide(String text, Image image) {
        super(text, image);
    }

    public FrontSide(Image image) {
        super(image);
    }

    public FrontSide(String text) {
        super(text);
    }
}
