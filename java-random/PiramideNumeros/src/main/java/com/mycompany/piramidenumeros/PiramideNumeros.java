package com.mycompany.piramidenumeros;

import java.util.Scanner;

public class PiramideNumeros {

    public static void printPyramid(int numero) {
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = numero - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Insere um número entre 1 e 9:");
            int numero = scanner.nextInt();

            if (numero > 9) {
                System.out.println("Numero não é válido!");
            } else {
                printPyramid(numero);
            }
        } while (true);
    }

}
