/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edureyes1
 */
public class BinarySearch {

    int binarySearch(int[] array, int target) throws BSException {
        return binarySearch(array, target, 0, array.length - 1);
    }

    int binarySearch(int[] array, int target, int lower, int upper) throws BSException {
        int center, range;
        range = upper - lower;
        if (range < 0) {
            throw new BSException("Limits reversed");
        } else if (range == 0 && array[lower] != target) {
            throw new BSException("Element not in array");
        }
        if (array[lower] > array[upper]) {
            throw new BSException("Array not sorted");
        }
        center = ((range) / 2) + lower;
        if (target == array[center]) {
            return array[center];
        } else if (target < array[center]) {
            return binarySearch(array, target, lower, center - 1);
        } else {
            return binarySearch(array, target, center + 1, upper);
        }
    }

    int iterBinarySearch(int[] array, int target) throws BSException {
        int lower = 0, upper = array.length - 1;
        int center, range;
        if (lower > upper) {
            throw new BSException("Limits reversed");
        }
        while (true) {
            range = upper - lower;
            if (range == 0 && array[lower] != target) {
                throw new BSException("Element not in array");
            }
            if (array[lower] > array[upper]) {
                throw new BSException("Array not sorted");
            }
            center = ((range) / 2) + lower;
            if (target == array[center]) {
                return array[center];
            } else if (target < array[center]) {
                upper = center - 1;
            } else {
                lower = center + 1;
            }
        }
    }

    public static void main(String args[]) {
        try {
            int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
            BinarySearch bs = new BinarySearch();
            int number = 9;
            int foundNumber = bs.binarySearch(arrayInt, number);
            System.out.println("Found number: " + foundNumber);
        } catch (BSException ex) {
            Logger.getLogger(BinarySearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
