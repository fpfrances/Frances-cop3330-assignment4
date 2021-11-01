/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Filipe Frances
 */
package ucf.assignments;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class LoadOptCtrl{
    public static Stage LoadOptionsStage;
    private Stage stage;
    public LoadOptCtrl(Stage stage){
        this.stage = stage;
        LoadOptionsStage = stage;
    }

    public LoadOptCtrl(){
        this.stage = new Stage();
    }

    @FXML
    void SelectListsButtonClicked(ActionEvent event) throws IOException{

        // open the select lists window

        System.out.println("selection window");
        Parent root = FXMLLoader.load(getClass().getResource("ViewList.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        LoadOptionsStage.close();
        FXMLLoader loader = new FXMLLoader();
        loader.setController(new LoadListCtrl(stage));
    }

    @FXML
    void loadAllListsButtonClicked(ActionEvent event) throws IOException{

        //load all lists and open the list options window

        System.out.println("loading all\ncatalog window");
        Parent root = FXMLLoader.load(getClass().getResource("ViewListCatalog.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        LoadOptionsStage.close();
        FXMLLoader loader = new FXMLLoader();
        loader.setController(new ListCatalogCtrl(stage));
    }
}