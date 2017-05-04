/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * https://www.hackerrank.com/challenges/the-power-sum
 * http://anothercasualcoder.blogspot.com.co/2017/03/the-power-sum-recursive-problem-by.html
 */
package com.recursion;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ThePowerSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int solutions = 0;
        
        process(0, x, 1, n, solutions);
        
        System.out.println("solutions: " + solutions);
    }
    
    static void process(int currentSum, int targetSum, int currentNumber, int n, int solutions){
        if(currentSum == targetSum){
            solutions++;
            return;
        }
        
        for(int i = currentNumber; currentSum + (int)Math.pow(i, n) <= targetSum; i++){
            process(currentSum + (int)Math.pow(i, n), targetSum, i + 1, n, solutions);
        }
    }
}
