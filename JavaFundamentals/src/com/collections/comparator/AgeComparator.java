/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections.comparator;

import java.util.Comparator;

/**
 *
 * @author edureyes1
 */
class AgeComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.age == s2.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
