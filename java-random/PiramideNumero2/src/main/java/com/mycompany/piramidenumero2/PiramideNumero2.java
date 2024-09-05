package com.mycompany.piramidenumero2;

import java.util.Scanner;

public class PiramideNumero2 {

    public static String criarPiramide(int numero) {
        StringBuilder piramide = new StringBuilder();

        for (int i = 1; i <= numero; i++) {

            for (int j = numero - i; j >= 1; j--) {
                piramide.append(" ");
            }

            for (int j = 1; j <= i; j++) {
                piramide.append(j);
            }

            for (int j = i - 1; j >= 1; j--) {
                piramide.append(j);
            }
            piramide.append("\n");
        }

        return piramide.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, opcao = 0;

        System.out.println("Bem-vindo ao programa PiramideNumero2!");

        do {
            System.out.println("\nInsira um numero de 1 a 9:");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 9) {
                System.out.println("Numero invalido. Tente novamente.");
                continue; // Volta para o início do loop
            }
            System.out.println("\nEscolha uma das opcoes:");
            System.out.println("1 - Imprimir piramide de numeros.");
            System.out.println("2 - Sair.");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Imprimir pirâmide
                    System.out.println("\nAqui esta a piramide:");
                    System.out.println(criarPiramide(numero));
                    break;
                case 2:
                    System.out.println("\nObrigado por utilizar o programa.");
                    break;

                default:
                    System.out.println("\nOpcao invalida! Por favor, escolhe novamente.");
            }

        } while (opcao != 2);
    }
}
