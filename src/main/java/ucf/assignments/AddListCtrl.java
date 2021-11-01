/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Filipe Frances
 */
package ucf.assignments;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddListCtrl {
    private Stage stage = new Stage();

    public static Stage AddListStage;

    @FXML
    private TextField newListName;

    public AddListCtrl(Stage stage){
        this.stage = stage;
        AddListStage = this.stage;
    }

    public AddListCtrl(){

    }

    @FXML
    void submitButtonClicked(ActionEvent action){

        // create a new list with the user's inputted name

        System.out.println("list - '"+ newListName.getText() +"' created");
        AddListStage.close();
    }
}