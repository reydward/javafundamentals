/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, 
 * except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. 
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * 
 * count8(8) → 1
 * count8(818) → 2
 * count8(8818) → 4
 * 
 * @author eduard.reyes
 */
public class Count8 {
    public static int count8(int n) {
        if(n == 0){
            return 0;
        }
        else{            
            int divide = n/10;
            int mod = n%10;

            if (mod == 8 && (divide % 10) == 8){
                return count8(divide) + 2;        
            }
            else if(mod == 8){
                return count8(divide) + 1;                
            }
            else{
                return count8(divide);
            }
        }
    }
    
    public static void main(String args[]) {
        System.out.println("--> " + count8(8888988));
    }
}
