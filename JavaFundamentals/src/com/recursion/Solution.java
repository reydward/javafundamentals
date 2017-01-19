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
public class Solution {

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

    static int[] getProductExcludingIndex(int[] numbers) {
        int[] results = new int[numbers.length];
        arrayProduct(numbers, results, 1, 0);

        return results;
    }

    static int arrayProduct(int[] numbers, int[] results, int product, int index) {
        if (index < numbers.length) {
            System.out.println("---> " + product);
            results[index] = arrayProduct(numbers, results, (product * numbers[index]), index + 1);
            return results[index];
        }
        return 1;
    }

    static int[] multiplyWraper(int[] array) {
        int response[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            response[i] = multiply(array, 1, 0, i);
        }

        return response;
    }

    static int multiply(int a[], int fwdProduct, int indx, int skip) {
        int revProduct = 1;
        if (indx < a.length) {

            revProduct = multiply(a, fwdProduct * a[indx], indx + 1, skip);

            int cur = a[indx];
            if (indx != skip) {
                revProduct *= cur;
            }
        }
        return revProduct;
    }

    static int multiply(int numbers[], int fwdProduct, int indx) {
        int revProduct = 1;
        if (indx < numbers.length) {

            revProduct = multiply(numbers, fwdProduct * numbers[indx], indx + 1);

            int cur = numbers[indx];
            numbers[indx] = fwdProduct * revProduct;
            revProduct *= cur;
        }
        return revProduct;
    }

    static int arrayProduct(int numbers[], int fwdProduct, int indx) {
        int revProduct = 1;
        if (indx < numbers.length) {

            revProduct = arrayProduct(numbers, fwdProduct * numbers[indx], indx + 1);
            int cur = numbers[indx];
            numbers[indx] = fwdProduct * revProduct;
            revProduct *= cur;
        }
        return revProduct;
    }
    
    public static void main(String[] args) throws IOException {

        /*        
        Scanner in = new Scanner(System.in);
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

//        multiply(_numbers, 1, 0);
        arrayProduct(_numbers, 1, 0);
        for (int i = 0; i < _numbers.length; i++) {
            System.out.println(_numbers[i]);
        }
//        res = multiplyWraper(_numbers);
//        res = getProductExcludingIndex(_numbers);
//        res = getProductExcludingIndexIteration(_numbers);
/*        for (int res_i = 0; res_i < res.length; res_i++) {
            System.out.println("res[" + res_i + "] = " + res[res_i]);
        }
         */
//        bw.close();
    }
}
