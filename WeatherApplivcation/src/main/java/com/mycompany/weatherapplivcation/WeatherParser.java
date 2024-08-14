/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weatherapplivcation;

/**
 *
 * @author Tim Ethane
 */
import org.json.JSONObject;

/**
 * WeatherParser is responsible for parsing the JSON data retrieved from the weather API.
 * It extracts specific weather details such as temperature, humidity, and conditions.
 */
public class WeatherParser {

    /**
     * Parses the raw weather data to extract information for display.
     * 
     * @param weatherData Raw JSON data from the weather API.
     * @param unit The unit of temperature (Celsius or Fahrenheit).
     * @return A formatted string containing weather information.
     */
    public static String parseWeatherData(String weatherData, String unit) {
        JSONObject json = new JSONObject(weatherData);
        JSONObject main = json.getJSONObject("main");
        double temp = main.getDouble("temp") - 273.15; // Convert from Kelvin to Celsius
        if (unit.equals("Fahrenheit")) {
            temp = temp * 9/5 + 32; // Convert to Fahrenheit if selected
        }
        int humidity = main.getInt("humidity");
        JSONObject wind = json.getJSONObject("wind");
        double windSpeed = wind.getDouble("speed");
        String description = json.getJSONArray("weather").getJSONObject(0).getString("description");

        return String.format("Temperature: %.2f %s\nHumidity: %d%%\nWind Speed: %.2f m/s\nCondition: %s",
                temp, unit.equals("Celsius") ? "°C" : "°F", humidity, windSpeed, description);
    }

    /**
     * Extracts the weather description from the raw weather data.
     * 
     * @param weatherData Raw JSON data from the weather API.
     * @return A string describing the current weather conditions.
     */
    public static String getWeatherDescription(String weatherData) {
        JSONObject json = new JSONObject(weatherData);
        return json.getJSONArray("weather").getJSONObject(0).getString("description");
    }
}
