/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 *
 * @author eduard.reyes
 */
public class Fibonacci {
    public static int fibonacci(int i){
        if(i == 0) return 0;
        if(i == 1) return 1;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }
    
    public static void main(String[] args) {
        System.out.println("-> " + fibonacci(6));
    }
    
}
