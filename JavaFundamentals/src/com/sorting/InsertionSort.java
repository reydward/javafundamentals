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
public class InsertionSort {

    public void insertionSort(int[] data) {
        for (int which = 1; which < data.length; ++which) {
            int val = data[which];
            for (int i = 0; i < which; ++i) {
                if (data[i] > val) {
                    System.arraycopy(data, i, data, i + 1, which - i);
                    data[i] = val;
                    break;
                }
            }
        }
    }
    
    public static void main(String args[]) {
        int[] arraInt = {1,4,8,4,9,0};
        
        InsertionSort ss = new InsertionSort();
        ss.insertionSort(arraInt);
        
        for (int i = 0; i < arraInt.length; i++) {
            System.out.println("["+i+"] = " + arraInt[i]);            
        }
    }    
}
