/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sorting;

/**
 *
 * @author edureyes1
 */
public class MergeSort {

    // Sort an array using a simple but inefficient merge sort. 
    public int[] mergeSortSimple(int[] data) {
        if (data.length < 2) {
            return data;
        }
        // Split the array into two subarrays of approx equal size.
        int mid = data.length / 2;
        int[] left = new int[mid];
        int[] right = new int[data.length - mid];
        System.arraycopy(data, 0, left, 0, left.length);
        System.arraycopy(data, mid, right, 0, right.length);
        // Sort each subarray, then merge the result.
        mergeSortSimple(left);
        mergeSortSimple(right);
        return merge(data, left, right);
    }

    // Merge two smaller arrays into a larger array.
    private int[] merge(int[] dest, int[] left, int[] right) {
        int dind = 0;
        int lind = 0;
        int rind = 0;
        // Merge arrays while there are elements in both 
        while (lind < left.length && rind < right.length) {
            if (left[lind] <= right[rind]) {
                dest[dind++] = left[lind++];
            } else {
                dest[dind++] = right[rind++];
            }
        }

        //Copy rest of whichever array remains
        while (lind < left.length) {
            dest[dind++] = left[lind++];
        }

        while (rind < right.length) {
            dest[dind++] = right[rind++];
        }
        return dest;
    }

    public static void main(String args[]) {
        int[] arraInt = {1, 4, 8, 4, 9, 0};

        QuickSort ss = new QuickSort();
        ss.quicksortSimple(arraInt);

        for (int i = 0; i < arraInt.length; i++) {
            System.out.println("[" + i + "] = " + arraInt[i]);
        }
    }
}
