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
public class InsertionSort {
    public static void performInsertionSort(List<MedicineInfo> medicineList, String item){
        int listSize = medicineList.size();
        
        for(int i = 1; i < listSize; i++){
            MedicineInfo temp = medicineList.get(i);
            int j = i - 1;
            switch(item){
                case("Name: A - Z"):
                    while(j >= 0 && temp.getMedName().compareToIgnoreCase(medicineList.get(j).getMedName()) < 0){
                        medicineList.set(j + 1, medicineList.get(j));
                        j--;
                    }
                    break;
                case("Name: Z - A"):
                    while(j >= 0 && temp.getMedName().compareToIgnoreCase(medicineList.get(j).getMedName()) > 0){
                        medicineList.set(j + 1, medicineList.get(j));
                        j--;
                    }
                    break;
            }
            medicineList.set(j + 1, temp);
        }
    }
}
