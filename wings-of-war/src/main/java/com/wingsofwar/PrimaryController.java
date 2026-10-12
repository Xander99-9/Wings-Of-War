package com.wingsofwar;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToStartingScreen() throws IOException {
        App.setRoot("startingScreen");
    }
}
