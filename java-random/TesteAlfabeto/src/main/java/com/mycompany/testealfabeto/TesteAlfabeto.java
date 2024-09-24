package com.mycompany.testealfabeto;

public class TesteAlfabeto {

    public static void main(String[] args) {
        String s1 = "bcd", s2 = "abcd";
        if (s1.compareTo(s2) > 0) {
            System.out.println("maior");
        } else if (s1.compareTo(s2) == 0) {
            System.out.println("igual");
        } else 
            System.out.println("menor");
    }
}
