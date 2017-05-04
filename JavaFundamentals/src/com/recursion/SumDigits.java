/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 * Given a non-negative int n, return the sum of its digits recursively (no loops). 
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * sumDigits(126) → 9
 * sumDigits(49) → 13
 * sumDigits(12) → 3
 * 
 * @author eduard.reyes
 */
public class SumDigits {
    public static int sumDigits(int n) {
        if(n < 10){
            return n;
        }
        else{
            int divide = n/10;
            int mod = n%10;
            return sumDigits(divide) + mod;
        }
    }
    
    public static void main(String args[]) {
        System.out.println("--> " + sumDigits(7531));
    }
}
