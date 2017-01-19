/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author edureyes1
 */
public class Solution1 {

    /**
     * Wrapper method for recursive method
     */
    static int[] getProductExcludingIndex(int numbers[]){
        int[] result = new int[numbers.length];
        arrayProduct(numbers, result, 1, 0);
        
        return result;
    }
    
    /**
     * Recursive method
     */
    static int arrayProduct(int numbers[], int result[], int product, int index) {
        int preProduct = 1;
        if (index < numbers.length) {

            preProduct = arrayProduct(numbers, result, product * numbers[index], index + 1);
            int cur = numbers[index];
            result[index] = product * preProduct;
            preProduct *= cur;
        }
        return preProduct;
    }

    /**
     * Method using iteration
     */
    static int[] getProductExcludingIndexIteration(int[] numbers) {
        int[] results = new int[numbers.length];
        int product = 1;

        for (int index = 0; index < numbers.length; index++) {
            product = 1;
            for (int i = 0; i < numbers.length; i++) {
                if (i != index) {
                    product *= numbers[i];
                }
            }
            results[index] = product;
        }

        return results;
    }
    
    public static void main(String[] args) throws IOException {

/*        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        
        int _numbers_size = Integer.parseInt(in.nextLine());
        int[] _numbers = new int[_numbers_size];
        int _numbers_item;
        for(int _numbers_i = 0; _numbers_i < _numbers_size; _numbers_i++) {
            _numbers_item = Integer.parseInt(in.nextLine());
            _numbers[_numbers_i] = _numbers_item;
        }
*/
        int[] res;
        int[] _numbers = {1, 2, 3, 4, 5};

        res = getProductExcludingIndex(_numbers);
//        res = getProductExcludingIndexIteration(_numbers);
        
        for (int res_i = 0; res_i < res.length; res_i++) {
            System.out.println("res[" + res_i + "] = " + res[res_i]);
        }
//        bw.close();

    }
    
}
