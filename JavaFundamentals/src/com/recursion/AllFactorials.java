/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 *
 * @author edureyes1
 */
public class AllFactorials {

    int[] allFactorials(int n) {
        /* Wrapper function */ 
        int[] results = new int[n == 0 ? 1 : n];
        doAllFactorials(n, results, 0);
        return results;
    }

    int doAllFactorials(int n, int[] results, int level) {
        if (n > 1) {
            /* Recursive case */
            results[level] = n * doAllFactorials(n - 1, results, level + 1);
            return results[level];
        } else {
            /* Base case */ 
            results[level] = 1;
            return 1;
        }
    }

    public static void main(String args[]) {
        AllFactorials factorial = new AllFactorials();
        int number = 5;
        int[] factorials = factorial.allFactorials(number);
        
        for (int i = 0; i < factorials.length; i++) {
            System.out.println("factorials["+i+"] = " + factorials[i]);
        }
        
    }
}
