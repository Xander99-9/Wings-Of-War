package com.wingsofwar;

import java.io.IOException;
import javafx.fxml.FXML;

public class OnePlayerController {

    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("oneplayermenu");
    }
}