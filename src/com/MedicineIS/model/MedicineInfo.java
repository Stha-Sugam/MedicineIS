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
    private String medStrength;
    private String medDosageForm;
    private String medManufacturer;
    private String medReleaseDate;
    private String medUsuage;

    public MedicineInfo(String medID, String medName, String medStrength, String medDosageForm, String medManufacturer, String medReleaseDate, String medUsuage) {
        this.medID = medID;
        this.medName = medName;
        this.medStrength = medStrength;
        this.medDosageForm = medDosageForm;
        this.medManufacturer = medManufacturer;
        this.medReleaseDate = medReleaseDate;
        this.medUsuage = medUsuage;
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

    public String getMedStrength() {
        return medStrength;
    }

    public void setMedStrength(String medStrength) {
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

    public String getMedExpiryDate() {
        return medReleaseDate;
    }

    public void setMedExpiryDate(String medExpiryDate) {
        this.medReleaseDate = medExpiryDate;
    }

    public String getMedUsuage() {
        return medUsuage;
    }

    public void setMedUsuage(String medUsuage) {
        this.medUsuage = medUsuage;
    }

        
}
