/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weatherapplivcation;

/**
 *
 * @author Tim Ethane
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * WeatherApiClient is responsible for fetching weather data from the API.
 * It makes HTTP requests to retrieve the weather information in JSON format.
 */
public class WeatherApiClient {

    private static final String API_KEY = "57c318c9b9f55b977bd6bfe330974491"; // Replace with your actual API key
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather";

    /**
     * Fetches weather data for a specific location.
     * 
     * @param location The name of the city or geographical coordinates.
     * @return A string containing the raw JSON response from the API.
     * @throws Exception If an error occurs during the API request.
     */
    public static String getWeatherData(String location) throws Exception {
        String urlString = String.format("%s?q=%s&appid=%s", BASE_URL, location, API_KEY);
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();
        connection.disconnect();

        return content.toString();
    }
}
