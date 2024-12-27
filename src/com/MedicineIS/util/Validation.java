/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MedicineIS.util;

import java.util.regex.Pattern;

/**
 *
 * @author sugam
 */
public class Validation {
    private static final Pattern IDPATTERN = Pattern.compile("^[a-zA-Z]{3,4}\\d{2,4}$");
    private static final Pattern FORMPATTERN = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern EXPDATEPATTERN = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}$");
    private static final Pattern STRENGTHPATTERN = Pattern.compile("^\\d{1,4} mg$");
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
    
    public static boolean checkExpDate(String date){
        return EXPDATEPATTERN.matcher(date).matches();
    }
    
    public static boolean checkManufacturer(String manufacturer){
        return DOUBLESTRINGPATTERN.matcher(manufacturer).matches();
    }
    
    public static boolean checkStrength(String strength){
        return STRENGTHPATTERN.matcher(strength).matches();
    }
    
    public static boolean checkUsuage(String usuage){
        return DOUBLESTRINGPATTERN.matcher(usuage).matches();
    }
    
    
}
