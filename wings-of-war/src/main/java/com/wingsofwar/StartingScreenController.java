package com.wingsofwar;

import java.io.IOException;
import javafx.fxml.FXML;

public class StartingScreenController {

    @FXML
    private void switchToOnePlayer() throws IOException {
        App.setRoot("onePlayer");
    }

    //@FXML
    //private void switchToTwoPlayer() throws IOException {
        //App.setRoot("twoplayer");
    //}
}