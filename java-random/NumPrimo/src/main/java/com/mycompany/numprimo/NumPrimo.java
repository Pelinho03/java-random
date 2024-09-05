package com.mycompany.numprimo;

import java.util.Scanner;

public class NumPrimo {

    public static void main(String[] args) {
        int inicio, fim, primo = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero inicial: ");
        inicio = entrada.nextInt();
        System.out.print("Numero final: ");
        fim = entrada.nextInt();

        for (int i = inicio; i <= fim; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println("O número " + i + " é PRIMO!");
            }
            primo = 0;
        }

        entrada.close();
    }
}
