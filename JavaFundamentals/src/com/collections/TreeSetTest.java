/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author edureyes1
 */
public class TreeSetTest {

    public static void main(String args[]) {
        //Creating and adding elements  
        TreeSet<String> al = new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        
        //Traversing elements  
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
