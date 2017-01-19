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
 * https://www.hackerrank.com/challenges/java-if-else?h_r=next-challenge&h_v=zen
 */
public class IfElse {

    public static void main(String[] args){

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else{
                if(n>=2 && n<=5){
                  ans = "Not Weird";                
                }
                if(n>=6 && n<=20){
                  ans = "Weird";                
                }
                if(n>20){
                  ans = "Not Weird";                
                }
            }
            System.out.println(ans);        
        
    }

}
