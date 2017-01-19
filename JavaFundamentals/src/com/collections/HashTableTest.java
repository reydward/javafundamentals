/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author edureyes1
 */
public class HashTableTest {

    public static void main(String args[]) {
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

        hm.put(104, "Amit");
        hm.put(100, "Amit");
        hm.put(102, "Ravi");
        hm.put(101, "Vijay");
        hm.put(103, "Rahul");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
