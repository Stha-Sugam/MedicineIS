/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medicineis.controller.algorithms;

import com.MedicineIS.model.MedicineInfo;
import java.util.List;



/**
 *
 * @author sugam
 */
public class SelectionSort {
    public static void performSelectionSort(List<MedicineInfo> medicineList, String item){
        int listSize = medicineList.size();
        
        for(int step = 0; step < listSize - 1; step++){
            int min = step;
            
            
            for (int next = step + 1; next < listSize; next++){
                switch(item){
                    case ("ID: A - Z"):
                        if (medicineList.get(next).getMedID().compareToIgnoreCase(medicineList.get(min).getMedID()) < 0){
                            min = next;
                        }
                        break;
                    case ("ID: Z - A"):
                        if (medicineList.get(next).getMedID().compareToIgnoreCase(medicineList.get(min).getMedID()) > 0){
                            min = next;
                        }
                        break;
                    case ("Manufacturer: A - Z"):
                        if (medicineList.get(next).getMedManufacturer().compareToIgnoreCase(medicineList.get(min).getMedManufacturer()) < 0){
                            min = next;
                        }
                        break;
                    case ("Manufacturer: Z - A"):
                        if (medicineList.get(next).getMedManufacturer().compareToIgnoreCase(medicineList.get(min).getMedManufacturer()) > 0){
                            min = next;
                        }
                        break;
                }
                
            }
            MedicineInfo temp = medicineList.get(step);
            medicineList.set(step, medicineList.get(min));
            medicineList.set(min, temp);
        }
    }
}
