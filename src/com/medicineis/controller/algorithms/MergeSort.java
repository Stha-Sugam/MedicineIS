/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medicineis.controller.algorithms;

import com.MedicineIS.model.MedicineInfo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sugam Shrestha
 */
public class MergeSort {
    public static void performMergeSort(List<MedicineInfo> medicineList, String item){
        int listSize = medicineList.size();
        
        if (listSize <= 1) {
            return;
        }
        
        int mid = listSize/2;
        List<MedicineInfo> leftList = new ArrayList(medicineList.subList(0, mid));
        List<MedicineInfo> rightList = new ArrayList(medicineList.subList(mid, listSize));
        
        performMergeSort(leftList,  item);
        performMergeSort(rightList, item);
 
        merge(leftList, rightList, medicineList, item);
    }
    
    public static void merge(List<MedicineInfo> leftList, List<MedicineInfo> rightList, List<MedicineInfo> medicineList, String item){
        int leftIndex = 0; //Index for left list
        int rightIndex = 0; //Index for right list
        int listIndex = 0; //Index for main list
        
        while(leftIndex < leftList.size() && rightIndex < rightList.size()){
            switch(item){
                case("Price: High - Low"):
                    if (leftList.get(leftIndex).getMedPrice() >= rightList.get(rightIndex).getMedPrice()) {
                        medicineList.set(listIndex++, leftList.get(leftIndex++));
                    } else {
                        medicineList.set(listIndex++, rightList.get(rightIndex++));
                    }
                    break;
                case("Price: Low - High"):
                    if (leftList.get(leftIndex).getMedPrice() <= rightList.get(rightIndex).getMedPrice()) {
                        medicineList.set(listIndex++, leftList.get(leftIndex++));
                    } else {
                        medicineList.set(listIndex++, rightList.get(rightIndex++));
                    }
                    break;
                case("Strength: High - Low"):
                    if (leftList.get(leftIndex).getMedStrength() >= rightList.get(rightIndex).getMedStrength()) {
                        medicineList.set(listIndex++, leftList.get(leftIndex++));
                    } else {
                        medicineList.set(listIndex++, rightList.get(rightIndex++));
                    }
                    break;
                case("Strength: Low - High"):
                    if (leftList.get(leftIndex).getMedStrength() <= rightList.get(rightIndex).getMedStrength()) {
                        medicineList.set(listIndex++, leftList.get(leftIndex++));
                    } else {
                        medicineList.set(listIndex++, rightList.get(rightIndex++));
                    }
                    break;
            }
        }
        while (leftIndex < leftList.size()) {
            medicineList.set(listIndex++, leftList.get(leftIndex++));
        }

        // Copy remaining elements from the right list (if any)
        while (rightIndex < rightList.size()) {
            medicineList.set(listIndex++, rightList.get(rightIndex++));
        }
    }
}
