module com.group.flashcardapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.group.flashcardapp to javafx.fxml;
    exports com.group.flashcardapp;
    exports com.group.flashcardapp.controller;
    opens com.group.flashcardapp.controller to javafx.fxml;
}