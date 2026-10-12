package com.wingsofwar;

import java.io.IOException;
import javafx.fxml.FXML;

public class StartingScreenController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}