package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.awt.*;

public class Controller {

    @FXML
    private TextField textfieldOne;

    @FXML
    private Button captain;

    @FXML
    private Button hulk;

    @FXML
    private Button thor;

    @FXML
    private Button ironman;

    @FXML
    public void onButtonTapped(ActionEvent) {
        if(e.getSource().equals(captain)) {
            System.out.println("Captain was clicked by : " + textfieldOne.getText());

        } else if (e.getSource().equals(hulk)) {
            System.out.println("Hulk was clicked by : " + textfieldOne.getText());

        } else if (e.getSource().equals(thor)) {
            System.out.println("Thor was clicked by : " + textfieldOne.getText());

        } else if (e.getSource().equals(ironman)) {
            System.out.println("Iron Man was clicked by : " + textfieldOne.getText());

        }
    }

}
