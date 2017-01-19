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
public class SelectionSort {

    // Sort private a subset of the array starting at the given index.
    private void selectionSortRecursive(int[] data, int start) {
        if (start < data.length - 1) {
            swap(data, start, findMinimumIndex(data, start));
            selectionSortRecursive(data, start + 1);
        }
    }

    // Find the position of the minimum value starting at the given index.
    private int findMinimumIndex(int[] data, int start) {
        int minPos = start;
        for (int i = start + 1; i < data.length; ++i) {
            if (data[i] < data[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }

    //Swap two elements in an array.
    private void swap(int[] data, int index1, int index2) {
        if (index1 != index2) {
            int tmp = data[index1];
            data[index1] = data[index2];
            data[index2] = tmp;
        }
    }

    public static void main(String args[]) {
        int[] arraInt = {1,4,8,4,9,0};
        
        SelectionSort ss = new SelectionSort();
        ss.selectionSortRecursive(arraInt, 0);
        
        for (int i = 0; i < arraInt.length; i++) {
            System.out.println("["+i+"] = " + arraInt[i]);            
        }
    }
}
