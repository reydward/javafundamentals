/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.introduction;

/**
 *
 * @author edureyes1
 */
public class StaticExample{
    
    {
        System.out.println("Anonimous block");
    }
    
    static {
        System.out.println("This is first static block");
    }

    public StaticExample(){
        System.out.println("This is constructor");
    }

    public static String staticString = "Static Variable";

    static {
        System.out.println("This is second static block and "
		                                        + staticString);
    }

    public static void main(String[] args){
        StaticExample statEx = new StaticExample();
        StaticExample.staticMethod2();
    }

    static {
        staticMethod();
        System.out.println("This is third static block");
    }

    public static void staticMethod() {
        System.out.println("This is static method");
    }

    public static void staticMethod2() {
        System.out.println("This is static method2");
    }

    public void method1() {
        System.out.println("This is normal Method1");
    }
}
