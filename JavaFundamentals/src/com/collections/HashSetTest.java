/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author edureyes1
 */
public class HashSetTest {

    public static void main(String[] args) {
        //Creating HashSet and adding elements  
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add(null);
        //Traversing elements  
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
