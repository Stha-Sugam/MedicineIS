/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medicineis.controller.algorithms;

import com.MedicineIS.model.MedicineInfo;
import java.util.List;

/**
 * The class implements the binary search algorithm for searching a medicine
 * by it's name in a sorted list of MedicineInfo instances
 * It provides a method to recursively find the medicine in the list.
 * 
 * @author Sugam Shrestha
 */
public class BinarySearch {
    
    /**
     * This method searches for a specific medicine by it's name in the given list
     * recursively using binary search
     * 
     * @param value the name to be searched entered by the user 
     * @param medicineList list where the value is to be searched
     * @param leftIndex the starting index of the search range
     * @param rightIndex the ending index of the search range
     * @return the instance of MedicineInfo with the searched value if found, or null if not found
     */
    public static MedicineInfo findName(String value, List<MedicineInfo> medicineList,
            int leftIndex, int rightIndex) {

        // Base Case: search range invalid
        if (rightIndex < leftIndex) {
            return null;
        }

        // Calculate the mid index
        int midIndex = (leftIndex + rightIndex) / 2;

        // Checks if the medicine name matches with the value of mid index
        if (value.compareToIgnoreCase(medicineList.get(midIndex).getMedName()) == 0) {
            return medicineList.get(midIndex);
        // If the value is smaller than the value in mid-point, search the left half.
        } else if (value.compareToIgnoreCase(medicineList.get(midIndex).getMedName()) < 0) {
            return findName(value, medicineList, leftIndex, midIndex - 1);
        // If the value is larger than the value in mid-point, search the right half.
        } else {
            return findName(value, medicineList, midIndex + 1, rightIndex);
        }
    }
}
