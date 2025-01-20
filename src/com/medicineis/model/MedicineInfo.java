/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MedicineIS.model;

/**
 * Represents a single medicine data with details such as Id, name, strength, form, manufacturer, price and usage
 * Encapsulates all the necessary information for a specific medicine and provide getter and setter methods for
 * accessing and modifying each attribute
 * 
 * Functions:
 * Stores the values such as Id, name, strength etc in an instance of a specific medicine
 * provides methods for retrieving and updating the medication data
 * 
 * @author Sugam Shrestha
 * LMU ID: 23048636
 */
public class MedicineInfo {
    
    // Declaration of attributes of a instance of MedicineInfo with private modifier
    private String medId;
    private String medName;
    private int medStrength;
    private String medDosageForm;
    private String medManufacturer;
    private int medPrice;
    private String medUsage;
    
    /**
     * This is a constructor for the class MedicineInfo
     * Initializes a new instance of MedicineInfo with specified details of the medication
     * 
     * @param medId the unique identifier of a medicine
     * @param medName the title of the medicine
     * @param medStrength the strength of the medicine(in mg)
     * @param medDosageForm the dosage form of the medicine(example pill, tablet)
     * @param medManufacturer the name of the manufacturer who developed and distributes the medicine
     * @param medPrice the price of the medicine
     * @param medUsage the intended use case of purpose of the medicine
     */
    public MedicineInfo(String medId, String medName, 
            int medStrength, String medDosageForm,
            String medManufacturer, int medPrice, String medUsage) {
        // Initializing the attributes of medications
        this.medId = medId;
        this.medName = medName;
        this.medStrength = medStrength;
        this.medDosageForm = medDosageForm;
        this.medManufacturer = medManufacturer;
        this.medPrice = medPrice;
        this.medUsage = medUsage;
    }

    /**
     * Retrieves the unique Id of the medicine
     * 
     * @return the Id of the medicine
     */
    public String getMedId() {
        return medId;
    }

    /**
     * Assigns a new IdDfor a medicine
     * 
     * @param medId the new Id for the medicine
     */
    public void setMedId(String medId) {
        this.medId = medId;
    }

    /**
     * Retrieves the name of the medicine
     * 
     * @return the name of the medicine
     */
    public String getMedName() {
        return medName;
    }

    /**
     * Assigns a new name for a medicine
     * 
     * @param medName the new name for the medicine
     */
    public void setMedName(String medName) {
        this.medName = medName;
    }

    /**
     * Retrieves the strength of the medicine
     * 
     * @return the strength of the medicine
     */
    public int getMedStrength() {
        return medStrength;
    }

    /**
     * Assigns a new strength for a medicine
     * 
     * @param medStrength the new strength for the medicine
     */
    public void setMedStrength(int medStrength) {
        this.medStrength = medStrength;
    }

    /**
     * Retrieves the dosage form of the medicine
     * 
     * @return the dosage form of the medicine
     */
    public String getMedDosageForm() {
        return medDosageForm;
    }

    /**
     * Assigns a new dosage form for a medicine
     * 
     * @param medDosageForm the new dosage form for the medicine
     */
    public void setMedDosageForm(String medDosageForm) {
        this.medDosageForm = medDosageForm;
    }

    /**
     * Retrieves the manufacturer of the medicine
     * 
     * @return the manufacturer of the medicine
     */
    public String getMedManufacturer() {
        return medManufacturer;
    }

    /**
     * Assigns a new manufacturer for a medicine
     * 
     * @param medManufacturer the new manufacturer for the medicine
     */
    public void setMedManufacturer(String medManufacturer) {
        this.medManufacturer = medManufacturer;
    }

    /**
     * Retrieves the price of the medicine
     * 
     * @return the price of the medicine
     */
    public int getMedPrice() {
        return medPrice;
    }

    /**
     * Assigns a new price for a medicine
     * 
     * @param medPrice the new price for the medicine
     */
    public void setMedPrice(int medPrice) {
        this.medPrice = medPrice;
    }

    /**
     * Retrieves the usage of the medicine
     * 
     * @return the usage of the medicine
     */
    public String getMedUsage() {
        return medUsage;
    }

    /**
     * Assigns a new usage for a medicine
     * 
     * @param medUsage the new usage for the medicine
     */
    public void setMedUsage(String medUsage) {
        this.medUsage = medUsage;
    }  
}
