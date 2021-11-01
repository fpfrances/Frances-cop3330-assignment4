/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Filipe Frances
 */
package ucf.assignments;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ConfirmDelCtrl{
    private Stage stage = new Stage();
    public static Stage ConfirmDeleteStage;

    public ConfirmDelCtrl(Stage stage){
        this.stage = stage;
        ConfirmDeleteStage = this.stage;
    }

    public ConfirmDelCtrl(){

    }

    @FXML
    void cancelButtonClicked(ActionEvent action){
        System.out.println("action canceled");
        ConfirmDeleteStage.close();
    }

    @FXML
    void confirmButtonClicked(ActionEvent action){
        System.out.println("action confirmed");
        ConfirmDeleteStage.close();
    }
}