/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weatherapplivcation;

/**
 *
 * @author Tim Ethane
 */
import java.util.ArrayList;
import java.util.List;

/**
 * SearchHistory stores and manages the history of weather searches.
 * It maintains a list of recent search entries for display.
 */
public class SearchHistory {

    private static List<String> history = new ArrayList<>();

    /**
     * Adds a new search entry to the history.
     * 
     * @param entry The search entry to be added (formatted string).
     */
    public static void addHistory(String entry) {
        history.add(entry);
    }

    /**
     * Returns the list of search history entries.
     * 
     * @return A list of formatted search history strings.
     */
    public static List<String> getHistory() {
        return history;
    }
}
