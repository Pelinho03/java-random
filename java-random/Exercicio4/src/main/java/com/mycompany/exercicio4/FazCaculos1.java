package com.mycompany.exercicio4;

public class FazCaculos1 {

    public static void print() {

        Calculadora calc1 = new Calculadora();

        System.out.println("**************************************************");
        System.out.println("A soma e = " + calc1.somar(2.7, 5.2));
        System.out.println("A subtracao e = " + calc1.subtrair(2.7, 5.2));
        System.out.println("A multiplicacao e = " + calc1.multiplicar(2.7, 5.2));
        System.out.println("A divicao e = " + calc1.dividir(2.7, 5.2));
        System.out.println("**************************************************");
    }

}
