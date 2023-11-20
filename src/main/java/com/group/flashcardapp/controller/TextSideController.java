package com.group.flashcardapp.controller;

import com.group.flashcardapp.model.TextSide;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class TextSideController {
    @FXML
    private TextArea textArea;

    private TextSide textSide;

    public void init() {
        textArea.setText(textSide.getText());
    }

}
