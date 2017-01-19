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
 * https://www.hackerrank.com/challenges/java-stdin-stdout?h_r=next-challenge&h_v=zen
 */
public class StdinStdout {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        String s1 = scan.nextLine();
        scan.close();
        
        System.out.println("String: " + s1);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
