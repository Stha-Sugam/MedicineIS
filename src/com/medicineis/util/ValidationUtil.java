/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medicineis.util;

import java.util.regex.Pattern;

/**
 * ValidationUtil is a class consisting of patterns for validating data entered by the users
 * ValidationUtil has various methods for validating their respective entered data.
 * 
 * @author Sugam Shrestha
 * LMU ID: 23048636
 */
public class ValidationUtil {
    // pattern for medicine id format
    private static final Pattern ID_PATTERN = Pattern.compile("^MED\\d{3}+$");
    // pattern for dosage form format
    private static final Pattern FORM_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    // pattern for string pattern format
    private static final Pattern ARE_ALPHABETS = Pattern.compile("^[A-Za-z]+( [A-Za-z]+)*$");
    
    /**
     * Method for checking empty or null text fields
     * 
     * @param value data from text field entered to be checked for null or empty
     * @return true if null or empty and false if not null or not empty
     */
    public static boolean checkNullorEmpty(String value){
        return value == null || value.trim().isEmpty();
    }
    
    /**
     * Method for checking medicine id entered
     * 
     * @param id the medicine id entered to be checked
     * @return true if pattern matches and false if does not
     */
    public static boolean checkId(String id){
        return ID_PATTERN.matcher(id).matches();
    }
    
    /**
     * Method for validating name of medicine entered
     * 
     * @param name the medicine name entered to be validated
     * @return true if valid pattern and false if invalid
     */
    public static boolean checkName(String name){
        return ARE_ALPHABETS.matcher(name).matches();
    }
    
    /**
     * Method to validate dosage form of medicine entered
     * 
     * @param form the medicine form entered to be validated
     * @return true if correct pattern and false if incorrect
     */
    public static boolean checkForm(String form){
        return FORM_PATTERN.matcher(form).matches();
    }
    
    /**
     * Method to check if the entered price is valid or not
     * 
     * @param price the medicine price entered to be validated
     * @return true if price is greater than 0 and false if not
     */
    public static boolean checkPrice(int price){
        return price > 0;
    }
    
    /**
     * Method to validate medicine manufacturer entered by the user
     * 
     * @param manufacturer the medicine manufacturer entered to be validated
     * @return true if correct pattern for manufacturer data and false if not
     */
    public static boolean checkManufacturer(String manufacturer){
        return ARE_ALPHABETS.matcher(manufacturer).matches();
    }
    
    /**
     * Method to validate medicine strength that is entered by the user
     * 
     * @param strength the data for strength entered by the user
     * @return true if valid strength and false if not
     */
    public static boolean checkStrength(int strength){
        return strength > 0 && strength < 2000;
    }
    
    /**
     * Method to check if usage entered by the user is all alphabet words
     * 
     * @param usage the data of medicine usage that is to be checked
     * @return true if entered data matches with pattern and false if not
     */
    public static boolean checkUsage(String usage){
        return ARE_ALPHABETS.matcher(usage).matches();
    }
}
