/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medicineis.controller.algorithms;

import com.MedicineIS.model.MedicineInfo;
import java.util.List;

/**
 *
 * @author Sugam Shrestha
 */
public class BinarySearch {

    public static MedicineInfo findName(String value, List<MedicineInfo> medicineList,
            int left, int right) {

        // Base Case
        if (right < left) {
            return null;
        }

        // mid value
        int mid = (left + right) / 2;

        // checks whether searchKey lies on mid point
        if (value.compareToIgnoreCase(medicineList.get(mid).getMedName()) == 0) {
            return medicineList.get(mid);
        } else if (value.compareToIgnoreCase(medicineList.get(mid).getMedName()) < 0) {
            return findName(value, medicineList, left, mid - 1);
        } else {
            return findName(value, medicineList, mid + 1, right);
        }
    }
}
