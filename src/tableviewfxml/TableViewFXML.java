/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package tableviewfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author kristian
 */
public class TableViewFXML extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
       primaryStage.setTitle("FXML TableView Example");
       Pane myPane = (Pane)FXMLLoader.load(getClass().getResource("View.fxml"));
       
       
       Scene myScene = new Scene(myPane);
       primaryStage.setScene(myScene);
       primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
    
}
