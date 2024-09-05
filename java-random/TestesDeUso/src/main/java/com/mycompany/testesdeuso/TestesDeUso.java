package com.mycompany.testesdeuso;

import java.util.Scanner;

public class TestesDeUso {

    public static void m(int[] x) {
        for (int i = 0; i < 3; i++) {
            x[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        for (int e : a) {
            System.out.println(e);
        }
        m(a);
        for (int e : a) {
            System.out.println(e);

        }
    }
}
