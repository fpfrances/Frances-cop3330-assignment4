/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Filipe Frances
 */
package ucf.assignments;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddItemCtrl{
    private Stage stage = new Stage();

    public static Stage AddItemStage;

    @FXML
    private TextField name;
    @FXML
    private TextField description;
    @FXML
    private DatePicker date;

    @FXML
    private TextField newItemName;

    public AddItemCtrl(Stage stage){
        this.stage = stage;
        AddItemStage = this.stage;
    }

    public AddItemCtrl(){

    }

    @FXML
    void submitButtonClicked(ActionEvent action){

        // create a new object from user inputted data
        // add to/replace the object depending on the context

        System.out.println("new item created:");
        System.out.println(this.name.getCharacters() + ", " + this.date.getValue() + ", " +this.description.getCharacters());
        AddItemStage.close();
    }
}
