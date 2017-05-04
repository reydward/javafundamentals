/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
 * so for example 717 yields 2. (no loops). 
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * 
 * count7(717) → 2
 * count7(7) → 1
 * count7(123) → 0
 * 
 * @author eduard.reyes
 */
public class Count7 {
    public static int count7(int n) {
        if(n == 0){
            return 0;
        }
        else{            
            int divide = n/10;
            int mod = n%10;

            if (mod == 7){
                return count7(divide) + 1;                
            }
            else{
                return count7(divide);
            }
        }
    }
    
    public static void main(String args[]) {
        System.out.println("--> " + count7(7123));
    }
}
