/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Filipe Frances
 */
package ucf.assignments;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ToDo extends Application{
    public static void main(String[] args){
        launch();
    }

    @Override
    public void start (Stage primaryStage) throws IOException{
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewToDoList.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 710, 410);
        primaryStage.setTitle("To-Do List Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    catch(IOException e){
        e.printStackTrace();
         }
    }
}