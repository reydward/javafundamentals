/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exceptions;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author edureyes1
 */
public class ExceptionsTest {

    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering" + " try statement");
            throw new IOException();            
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("Caught Exception: " + e.getMessage());

        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public static void main(String[] args) {
        ExceptionsTest et = new ExceptionsTest();
        et.writeList();
    }
}
