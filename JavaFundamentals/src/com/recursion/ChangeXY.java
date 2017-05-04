/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 * Given a string, compute recursively (no loops) a new string 
 * where all the lowercase 'x' chars have been changed to 'y' chars.
 * 
 * changeXY("codex") → "codey"
 * changeXY("xxhixx") → "yyhiyy"
 * changeXY("xhixhix") → "yhiyhiy"
 * 
 * @author eduard.reyes
 */
public class ChangeXY {
    public static String changeXY(String string) {
        if(string.length() == 0){
            return string;
        }
        if(string.contains("x")){
            int index = string.indexOf("x");
            
            if(index == 0){
                string = "y" + string.substring(1);
            }else if(index == string.length()-1){
                string = string.substring(0, string.length() - 1) + "y";                
            }else{
                string = string.substring(0, index) + "y" + string.substring(index + 1, string.length());                
            }
            changeXY(string);           
            return string;
        }else{
            return string;
        }        
    }
    
    public static String changeXYBetter(String str)
    {
            char ch;
            if(str.length() == 0)
                    return str;
            ch = str.charAt(0);
            if(ch == 'x')
                    return 'y' + changeXYBetter(str.substring(1));
            return ch + changeXYBetter(str.substring(1));
    }
    
    public static void main(String args[]) {
//        System.out.println("--> " + changeXY("xxhixx"));
        System.out.println("--> " + changeXYBetter("xxhixx"));
    }
}
