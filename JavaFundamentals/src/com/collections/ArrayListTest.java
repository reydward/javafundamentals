/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author edureyes1
 */
public class ArrayListTest {

    public static void main(String[] args) {

        //------ Without generics
        System.out.println("------ Without generics");
        ArrayList al = new ArrayList();
        al.add(34);
        al.add("text");
        al.add(false);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //------ With generics
        System.out.println("------ With generics");
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist  
        list.add("Ravi");//Adding object in arraylist  
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        list.add(null);
        //Traversing list through Iterator  
        itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        //------ Iterating by for
        System.out.println("------ Iterating by for");
        for(String obj:list){
            System.out.println(obj);  
        }
    }
}
