/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medicineis.controller.algorithms;

import com.MedicineIS.model.MedicineInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * This class sorts by price and strength using merge sorting algorithm
 *
 * @author Sugam Shrestha
 */
public class MergeSort {

    /**
     * This method sorts the data of medicineList by recursively separating one
     * list to two lists, rightList and leftList and merging them into the
     * original list after comparing for ascending or descending.
     *
     * @param medicineList the list to be sorted
     * @param item criteria for the data to be sorted by
     */
    public static void performMergeSort(List<MedicineInfo> medicineList, String item) {
        // Assign the list size of medicineList to listSize
        int listSize = medicineList.size();
        // If the list size is less or equal to one stop the process
        if (listSize <= 1) {
            return;
        }
        // Finding the middle index and assigning to midIndex
        int midIndex = listSize / 2;
        // Separating the main list into two more list i.e; leftList and rightList
        List<MedicineInfo> leftList = new ArrayList(medicineList.subList(0, midIndex));
        List<MedicineInfo> rightList = new ArrayList(medicineList.subList(midIndex, listSize));
        // Recursive process of breaking the list into smaller lists until the list has one item.
        performMergeSort(leftList, item);
        performMergeSort(rightList, item);
        // Calling the merge() method to join the left and right methods
        merge(leftList, rightList, medicineList, item);
    }

    /**
     * This method merges the sorted lists and combine them into the original
     * list.
     *
     * @param leftList the left list to be merged
     * @param rightList the right list to be merged
     * @param medicineList joined list of after merge of left and right lists
     * @param item criteria for the data to be sorted by
     */
    public static void merge(List<MedicineInfo> leftList, List<MedicineInfo> rightList, List<MedicineInfo> medicineList, String item) {
        //counter for left list, right list and main list respectively
        int leftIndex = 0, rightIndex = 0, listIndex = 0;
        // loop unless one of the lists(either left list or right list) is empty
        while (leftIndex < leftList.size() && rightIndex < rightList.size()) {
            switch (item) {
                // Sorting by price in ascending order
                case ("Price: Low - High"):
                    // Compare the values from leftList and rightList for ascending order sorting of price.
                    if (leftList.get(leftIndex).getMedPrice() <= rightList.get(rightIndex).getMedPrice()) {
                        /* 
                        If the value from the leftList is smaller or equal than the rightList then,
                        add that value(price) of the leftList to the mainList i.e; medicineList.
                         */
                        medicineList.set(listIndex, leftList.get(leftIndex));
                        //Increment to move to next value of leftList for further comparision.
                        leftIndex++;
                    } else {
                        /*
                        If the value from the rightList is smaller than the leftList then,
                        add that value(price) of the rightList to the mainList i.e; medicineList.
                         */
                        medicineList.set(listIndex, rightList.get(rightIndex));
                        //Increment to move to next value of rightList for further comparision.
                        rightIndex++;
                    }
                    // Increment the value of listIndex for adding another value in next position.
                    listIndex++;
                    break;
                // Sorting by price in descending order
                case ("Price: High - Low"):
                    // compare the values from leftList and rightList for descending order sorting of price.
                    if (leftList.get(leftIndex).getMedPrice() >= rightList.get(rightIndex).getMedPrice()) {
                        /*
                        If the value from the leftList is greater or equal than the rightList then,
                        add that value(price) of leftList to the main list i.e; medicineList.
                         */
                        medicineList.set(listIndex, leftList.get(leftIndex));
                        //Increment to move to next value of leftList for further comparision.
                        leftIndex++;
                    } else {
                        /*
                        If the value from the rightList is greater than the leftList then,
                        add that value(price) of leftList to the main list i.e; medicineList.
                         */
                        medicineList.set(listIndex, rightList.get(rightIndex));
                        //Increment to move to next value of rightList for further comparision.
                        rightIndex++;
                    }
                    // Increment the value of listIndex for adding another value in next position
                    listIndex++;
                    break;
                // Sorting by strength in ascending order
                case ("Strength: Low - High"):
                    // Compare the values from leftList and rightList for ascending order sorting of strength.
                    if (leftList.get(leftIndex).getMedStrength() <= rightList.get(rightIndex).getMedStrength()) {
                        /*
                        If the value from the leftList is smaller or equal than the rightList then,
                        add that value(strength) of leftList to the main list i.e; medicineList.
                         */
                        medicineList.set(listIndex, leftList.get(leftIndex));
                        //Incremet to move to next value of leftList for further comparsion.
                        leftIndex++;
                    } else {
                        /*
                        If the value from the rightList is smaller than leftList then,
                        add that value(strength) to the main list i.e; medicineList.
                         */
                        medicineList.set(listIndex, rightList.get(rightIndex));
                        // Increment to move to next value of rightList for further comparison.
                        rightIndex++;
                    }
                    // Increment the value of listIndex for adding another value in next position.
                    listIndex++;
                    break;
                // Sorting by strength in descending order
                case ("Strength: High - Low"):
                    // Compare the values from leftList and rightList for descending order sorting of strength.
                    if (leftList.get(leftIndex).getMedStrength() >= rightList.get(rightIndex).getMedStrength()) {
                        /*
                        If the value from the leftList is greater or equal than the rightList then,
                        add that value(strength) of leftList to the mainList i.e; medicineList.
                         */
                        medicineList.set(listIndex, leftList.get(leftIndex));
                        // Increment to move to next value of leftList for further comparison
                        leftIndex++;
                    } else {
                        /*
                        If the value from the rightList is greater than the leftList then,
                        add that value(strength) of rightList to the mainList i.e; medicineList.
                        */
                        medicineList.set(listIndex, rightList.get(rightIndex));
                        // Increment to move to next value of rightList for further comparison.
                        rightIndex++;
                    }
                    // Increment the value of listIndex for adding another value in next position.
                    listIndex++;
                    break;
            }
        }
        // Copy remaining elements from the left list (if any)
        while (leftIndex < leftList.size()) {
            // loop until there are no items in the leftList.
            medicineList.set(listIndex, leftList.get(leftIndex));
            // Increment the leftIndex for next value if present
            leftIndex++;
            // Increment the listIndex for adding next value to next position
            listIndex++;
        }

        // Copy remaining elements from the right list (if any)
        while (rightIndex < rightList.size()) {
            // loop until there are no items in the rightList
            medicineList.set(listIndex, rightList.get(rightIndex));
            // Increment the rightIndex for next value if present
            rightIndex++;
            // Increment the listIndex for adding next value to next position
            listIndex++;
        }
    }
}
