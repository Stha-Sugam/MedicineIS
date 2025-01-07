/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MedicineIS.model;

/**
 *
 * @author sugam.stha
 */
public class MedicineInfo {
    private String medID;
    private String medName;
    private int medStrength;
    private String medDosageForm;
    private String medManufacturer;
    private int medPrice;
    private String medUsage;

    public MedicineInfo(String medID, String medName, int medStrength, String medDosageForm, String medManufacturer, int medPrice, String medUsage) {
        this.medID = medID;
        this.medName = medName;
        this.medStrength = medStrength;
        this.medDosageForm = medDosageForm;
        this.medManufacturer = medManufacturer;
        this.medPrice = medPrice;
        this.medUsage = medUsage;
    }

    public String getMedID() {
        return medID;
    }

    public void setMedID(String medID) {
        this.medID = medID;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public int getMedStrength() {
        return medStrength;
    }

    public void setMedStrength(int medStrength) {
        this.medStrength = medStrength;
    }

    public String getMedDosageForm() {
        return medDosageForm;
    }

    public void setMedDosageForm(String medDosageForm) {
        this.medDosageForm = medDosageForm;
    }

    public String getMedManufacturer() {
        return medManufacturer;
    }

    public void setMedManufacturer(String medManufacturer) {
        this.medManufacturer = medManufacturer;
    }

    public int getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(int medPrice) {
        this.medPrice = medPrice;
    }

    public String getMedUsage() {
        return medUsage;
    }

    public void setMedUsage(String medUsage) {
        this.medUsage = medUsage;
    }

        
}
