/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.java.introduction;

import java.util.Scanner;

/**
 *
 * @author edureyes1
 */
public class Arithmetic {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double doubleCost = (((mealCost * tipPercent)/ 100) + ((mealCost * taxPercent)/ 100) + mealCost);
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(doubleCost);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
