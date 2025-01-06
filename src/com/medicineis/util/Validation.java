/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medicineis.util;

import java.util.regex.Pattern;

/**
 *
 * @author sugam
 */
public class Validation {
    private static final Pattern IDPATTERN = Pattern.compile("^[a-zA-Z]+\\d+$");
    private static final Pattern FORMPATTERN = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern DOUBLESTRINGPATTERN = Pattern.compile("^[A-Za-z]+( [A-Za-z]+)*$");
    
    public static boolean checkNullorEmpty(String value){
        return value == null || value.trim().isEmpty();
    }
    
    public static boolean checkId(String id){
        return IDPATTERN.matcher(id).matches();
    }
    
    public static boolean checkName(String name){
        return DOUBLESTRINGPATTERN.matcher(name).matches();
    }
    
    public static boolean checkForm(String form){
        return FORMPATTERN.matcher(form).matches();
    }
    
    public static boolean checkPrice(int price){
        return price > 0;
    }
    
    public static boolean checkManufacturer(String manufacturer){
        return DOUBLESTRINGPATTERN.matcher(manufacturer).matches();
    }
    
    public static boolean checkStrength(int strength){
        return strength > 0 && strength < 2000;
    }
    
    public static boolean checkUsuage(String usuage){
        return DOUBLESTRINGPATTERN.matcher(usuage).matches();
    }
    
    
}
