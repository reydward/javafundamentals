/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion;

/**
 *
 * @author edureyes1
 */
public class TelephoneNumber {

    private static final int PHONE_NUMBER_LENGTH = 7;
    private final int[] phoneNum;
    private char[] result = new char[PHONE_NUMBER_LENGTH];

    public TelephoneNumber(int[] n) {
        phoneNum = n;
    }

    public void printWords() {
        printWords(0);
    }

    private void printWords(int curDigit) {
        if (curDigit == PHONE_NUMBER_LENGTH) {
            System.out.println(new String(result));
            return;
        }
        for (int i = 1; i <= 3; ++i) {
            result[curDigit] = getCharKey(phoneNum[curDigit], i);
            printWords(curDigit + 1);
            if (phoneNum[curDigit] == 0 || phoneNum[curDigit] == 1) return;
        }
    }

    private char getCharKey(int telephoneKey, int place) {
        
        char[][] telephoneKeyPad = {
            {'a','b','c'},
        };
        
        if(telephoneKey == 0 || telephoneKey == 1){
            return (char)telephoneKey;
        }
        else{
            
        }
        
        return 'a';
    }
}
