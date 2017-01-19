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
public class Permutations {

    private boolean[] used;
    private StringBuilder out = new StringBuilder();
    private final String in;

    public Permutations(final String str) {
        in = str;
        used = new boolean[in.length()];
    }

    public void permute() {
        if (out.length() == in.length()) {
            System.out.println(out);
            return;
        }
        for (int i = 0; i < in.length(); ++i) {
            if (used[i]) {
                continue;
            }
            out.append(in.charAt(i));
            used[i] = true;
            permute();
            used[i] = false;
            out.setLength(out.length() - 1);
        }
    }

    public static void main(String args[]) {
        Permutations permutations = new Permutations("abc");
        permutations.permute();
    }

}
