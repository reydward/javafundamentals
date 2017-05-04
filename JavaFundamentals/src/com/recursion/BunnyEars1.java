/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 * We have a number of bunnies and each bunny has two big floppy ears. 
 * We want to compute the total number of ears across all the bunnies 
 * recursively (without loops or multiplication).
 * bunnyEars(0) → 0
 * bunnyEars(1) → 2
 * bunnyEars(2) → 4
 * 
 * @author eduard.reyes
 */
public class BunnyEars1 {
    public static int bunnyEars1(int bunnies) {
        if(bunnies == 0){
            return 0;
        }
        else{            
            return bunnyEars1(bunnies - 1) + 2;                
        }
    }
    
    public static void main(String args[]) {
        System.out.println("--> " + bunnyEars1(6));
    }
}
