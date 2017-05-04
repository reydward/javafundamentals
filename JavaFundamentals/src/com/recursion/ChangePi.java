/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
 * 
 * changePi("xpix") → "x3.14x"
 * changePi("pipi") → "3.143.14"
 * changePi("pip") → "3.14p"
 * 
 * @author eduard.reyes
 */
public class ChangePi {
    
    public static String changePi(String string)
    {
            char ch;
            if(string.length() == 0) return string;
            if(string.contains("pi")) return "3.14" + changePi(string.substring(string.indexOf("pi") + 2));
            return string + changePi(string.substring(1));
    }
    
    public static void main(String args[]) {
        System.out.println("--> " + changePi("pdgspip"));
    }
}
