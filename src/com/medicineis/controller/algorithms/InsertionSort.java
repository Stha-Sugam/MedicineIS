/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medicineis.controller.algorithms;

import com.MedicineIS.model.MedicineInfo;
import java.util.List;

/**
 * This class sorts by name using insertion sorting algorithm
 * 
 * @author Sugam Shrestha
 */
public class InsertionSort {
    /**
     * This method sorts the data of medicineList by selection sort algorithm
     * the loop starts with index 1 as the initial counter and is incremented for further comparison.
     * compares the current element with the elements before it then,
     * shifts their position according to descending or ascending order.
     * This process is repeated for every index until the list is fully sorted. 
     * 
     * @param medicineList the list to be sorted
     * @param item criteria for the data to be sorted by
     * @return sorted list for binary searching
     */
    public static List<MedicineInfo> performInsertionSort(List<MedicineInfo> medicineList, String item){
        // Assign the list size of medicineList to listSize
        int listSize = medicineList.size();
        // Start with index 1; loop until the index is less than the listSize
        for(int initialIndex = 1; initialIndex < listSize; initialIndex++){
            // Assign the value of initialIndex to a temp variable
            MedicineInfo temp = medicineList.get(initialIndex);
            // Assigning previousIndex as initialIndex - 1
            int previousIndex = initialIndex - 1;
            // Sorting according to the criteria
            switch(item){
                // Sorting by Name in ascending order
                case("Name: A - Z"):
                    // check if the value of name in previousIndex is lexicographically greater than the value of name in temp
                    // loop until the value of name in previousIndex is lexicographically smaller
                    while(previousIndex >= 0 && temp.getMedName().compareToIgnoreCase(medicineList.get(previousIndex).getMedName()) < 0){
                        // if greater, set the value of previousIndex + 1 to previousIndex
                        medicineList.set(previousIndex + 1, medicineList.get(previousIndex));
                        // reducing the previousIndex by 1 for further comparision
                        previousIndex--;
                    }
                    break;
                // Sorting by Name in descending order
                case("Name: Z - A"):
                    // check if the value of name in previousIndex is lexicographically smaller than the value of name in temp
                    // loop until the value of name in previousIndex is lexicographically greater
                    while(previousIndex >= 0 && temp.getMedName().compareToIgnoreCase(medicineList.get(previousIndex).getMedName()) > 0){
                        // if smaller, set the value of previousIndex + 1 to previousIndex
                        medicineList.set(previousIndex + 1, medicineList.get(previousIndex));
                        // reducing the previousIndex by 1 for further comparision
                        previousIndex--;
                    }
                    break;
            }
            // set the value of previousIndex + 1 to temp
            medicineList.set(previousIndex + 1, temp);
        }
        // return sorted medicineList for data searching.
        return medicineList;
    }
}
