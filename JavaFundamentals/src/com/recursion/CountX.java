/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
 * 
 * countX("xxhixx") → 4
 * countX("xhixhix") → 3
 * countX("hi") → 0
 * 
 * @author eduard.reyes
 */
public class CountX {
    
    public static int countX(String string) {
        if(string.length() == 1){
            if(string.charAt(0) == 'x'){
                return 1;                
            }           
            else{
                return 0;
            }
        }
        else if(string.isEmpty()){
            return 0;
        }
        else{            
            if(string.charAt(0) == 'x'){
                return 1 + countX(string.substring(1));
            }
            else{
                return countX(string.substring(1));
            }
        }
    }
    
    public static int countXBetter(String string) {
        if(string.length() == 0) return 0;
        if(string.charAt(0) == 'x') return 1 + countX(string.substring(1));
        else return countX(string.substring(1));        
    }
    
    public static void main(String args[]) {
        System.out.println("--> " + countXBetter("x"));
    }  
}
