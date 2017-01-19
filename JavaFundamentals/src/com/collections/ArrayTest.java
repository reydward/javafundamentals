/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

/**
 *
 * @author edureyes1
 */
public class ArrayTest {

    int[] arrayInt;
    int arrayInt2[] = {1, 2, 3};
    String[][] names = {
        {"Mr. ", "Mrs. ", "Ms. "},
        {"Smith", "Jones"}
    };

    public ArrayTest() {
        arrayInt = new int[10];
        arrayInt[0] = 1;
        //arrayInt2 = {1,2,3}; //wrong!
    }

    public static void main(String[] args) {
        ArrayTest collections = new ArrayTest();
        System.out.println("Hello World!! " + collections.names[1].length);

        //-------
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 1, 6);
        System.out.println(new String(copyTo));

        //------
        char[] copyFrom1 = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo1 = java.util.Arrays.copyOfRange(copyFrom1, 2, 9);

        System.out.println(new String(copyTo1));
    }
}
