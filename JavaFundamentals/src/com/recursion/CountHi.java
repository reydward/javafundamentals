/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
 * countHi("xxhixx") → 1
 * countHi("xhixhix") → 2
 * countHi("hi") → 1
 * 
 * @author eduard.reyes
 */
public class CountHi {
    
    public static int countHi(String string) {
        if(string.length() == 0) return 0;
        if(string.contains("hi")) return 1 + countHi(string.substring(string.indexOf("hi") + 2));
        else return countHi(string.substring(1));        
    }
    
    public static void main(String args[]) {
        System.out.println("--> " + countHi("hi"));
    } 
}
