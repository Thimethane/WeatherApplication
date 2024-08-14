/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weatherapplivcation;

/**
 *
 * @author Tim Ethane
 */
import javafx.scene.image.Image;

/**
 * WeatherIcon is responsible for providing the appropriate weather icon based on the weather description.
 */
public class WeatherIcon {

    /**
     * Returns an Image object corresponding to the weather description.
     * 
     * @param description The weather description (e.g., "clear sky", "rain").
     * @return An Image object representing the weather condition.
     */
    public static Image getWeatherIcon(String description) {
        String iconPath;
        switch (description.toLowerCase()) {
            case "clear sky":
                iconPath = "icons/sun.png";
                break;
            case "few clouds":
                iconPath = "icons/cloudy.png";
                break;
            case "rain":
                iconPath = "icons/rain.png";
                break;
            // Add more cases as needed
            default:
                iconPath = "icons/default.png";
        }

        return new Image(WeatherIcon.class.getResourceAsStream(iconPath));
    }
}

