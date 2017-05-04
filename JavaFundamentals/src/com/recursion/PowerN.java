/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 * Given base and n that are both 1 or more, compute recursively (no loops) 
 * the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
 * powerN(3, 1) → 3
 * powerN(3, 2) → 9
 * powerN(3, 3) → 27
 * 
 * @author eduard.reyes
 */
public class PowerN {
    public static int powerN(int n, int pow) {
        if(pow == 1){
            return n;
        }
        else{            
            return n * powerN(n, (pow - 1));                
        }
    }
    
    public static void main(String args[]) {
        System.out.println("--> " + powerN(3, 4));
    }    
}
