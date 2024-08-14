/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weatherapplivcation;

/**
 *
 * @author Tim Ethane
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class serves as the entry point for the Weather Information App.
 * It loads the FXML layout and initializes the primary stage.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("weather_app.fxml"));
        
        // Create a scene using the loaded FXML layout
        Scene scene = new Scene(loader.load());
        
        // Set up the primary stage
        primaryStage.setTitle("Weather Information App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main method that launches the application.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        launch(args);
    }
}
