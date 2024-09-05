package com.mycompany.exercicio4;

import java.util.Scanner;

public class FazCalculos2 {

    public static void print() {

        Scanner leia = new Scanner(System.in);

        Calculadora calc1 = new Calculadora();

        System.out.println("\nIntroduz o primeiro valor:");
        double num1 = leia.nextDouble();

        System.out.println("Introduz o segundo valor:");
        double num2 = leia.nextDouble();

        System.out.println("\n**************************************************");
        System.out.println("A soma e = " + calc1.somar(num1, num2));
        System.out.println("A subtracao e = " + calc1.subtrair(num1, num2));
        System.out.println("A multiplicacao e = " + calc1.multiplicar(num1, num2));
        if (num2 == 0) {
            System.out.println("Nao e possivel dividir por zero!");
        } else {
            System.out.println("A divicao e = " + calc1.dividir(num1, num2));
        }
        System.out.println("**************************************************");
    }

}
