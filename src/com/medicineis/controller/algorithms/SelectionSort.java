/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medicineis.controller.algorithms;

import com.MedicineIS.model.MedicineInfo;
import java.util.List;



/**
 * This class sorts by id and manufacturer using selection sorting algorithm
 * 
 * @author Sugam Shrestha
 * LMU ID: 23048636
 */
public class SelectionSort {
    /**
     * This method sorts the data of the medicineList by selecting a initial value from the list, 
     * and compares them with other items in the list, then swaps the values according to ascending or descending order.
     * 
     * @param medicineList the list to be sorted
     * @param item criteria for the data to be sorted by
     */
    public static void performSelectionSort(List<MedicineInfo> medicineList, String item){
        // Assign the list size of medicineList to listSize
        int listSize = medicineList.size();
        // Loop until the second last index in the array list
        for(int initialIndex = 0; initialIndex < listSize - 1; initialIndex++){
            // Assigning the initialIndex to currentIndex
            int currentIndex = initialIndex;
            // Loop until the last index in the arraylist
            for (int nextIndex = currentIndex + 1; nextIndex < listSize; nextIndex++){
                switch(item){
                    // Sorting by Id in ascending order
                    case ("ID: A - Z"):
                        // Check if the next Id is lexicographically smaller than the current Id
                        if (medicineList.get(nextIndex).getMedId().compareToIgnoreCase(medicineList.get(currentIndex).getMedId()) < 0){
                            // If smaller Id, assign the nextIndex to currentIndex
                            currentIndex = nextIndex;
                        }
                        break;
                    // Sorting by Id in descending order
                    case ("ID: Z - A"):
                        // Check if the next Id is lexicographically greater than the currect Id
                        if (medicineList.get(nextIndex).getMedId().compareToIgnoreCase(medicineList.get(currentIndex).getMedId()) > 0){
                            // If greater Id, assign the nextIndex to currentIndex
                            currentIndex = nextIndex;
                        }
                        break;
                    // Sorting by manufacturer in ascending order
                    case ("Manufacturer: A - Z"):
                        // Check if the next manufacturer is lexicographically smaller than the current manufacturer
                        if (medicineList.get(nextIndex).getMedManufacturer().compareToIgnoreCase(medicineList.get(currentIndex).getMedManufacturer()) < 0){
                            // If smaller manufacturer, assign the nextIndex to currentIndex
                            currentIndex = nextIndex;
                        }
                        break;
                    // Sorting by manufacturer in descending order
                    case ("Manufacturer: Z - A"):
                        // check if the next manufacturer is lexicographically greater than the current manufacturer
                        if (medicineList.get(nextIndex).getMedManufacturer().compareToIgnoreCase(medicineList.get(currentIndex).getMedManufacturer()) > 0){
                            // if greater manufacturer, assign the nextIndex to currentIndex
                            currentIndex = nextIndex;
                        }
                        break;
                }
            }
            /*
            Swapping the objects of medicineList for sorting
            temporary variable temp is created for swapping
            */
            // creation of temporary variable
            MedicineInfo temp = medicineList.get(initialIndex);
            // Setting the value of currentIndex to the value of initialIndex
            medicineList.set(initialIndex, medicineList.get(currentIndex));
            // Setting the value of temp to the value of currentIndex
            medicineList.set(currentIndex, temp);
        }
    }
}