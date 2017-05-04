/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author edureyes1
 */
public class HashMapTest {

    public static void main(String args[]) {
        String s = "test";
        
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(105, null);
        hm.put(106, null);
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        hm.put(103, "Amit");
        hm.put(104, s);
        hm.put(104, s);
        hm.put(null, null);
        hm.put(null, "a");
        hm.put(null, "c");
        hm.put(null, "b");
        
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
