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
public class Factorial {

    int factorialRecursive(int n) {
        if (n > 1) {
            /* Recursive case */
            return factorialRecursive(n - 1) * n;
        } else {
            /* Base case */
            return 1;
        }
    }

    int factorialIteration(int n) {
        int i, val = 1;
        for (i = n; i > 1; i--) {
            val *= i;
        }
        return val;
    }

    public static void main(String args[]) {
        Factorial factorial = new Factorial();
        int number = 4;
        System.out.println("Factorial " + number + " = " + factorial.factorialRecursive(number));
    }
}
