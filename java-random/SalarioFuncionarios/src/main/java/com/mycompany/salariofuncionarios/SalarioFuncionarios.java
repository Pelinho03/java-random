package com.mycompany.salariofuncionarios;

import java.util.Scanner;

public class SalarioFuncionarios {

    public static void main(String[] args) {
        int numeroDeSalarios;
        double somaDosSalarios=0, salario;
        
Scanner entrada = new Scanner(System.in);
        System.out.println("-----------FOLHA SALARIAL-----------");
        System.out.println("------------------------------------");
        System.out.print  ("Quantos salários pretendes inserir? ");
        numeroDeSalarios = entrada.nextInt();
        System.out.println("------------------------------------");

        if (numeroDeSalarios <= 0) {
            System.out.println("Por favor, insere um número válido de salários.");
            return;
        }

        for (int i = 1; i <= numeroDeSalarios; i++) {
            System.out.print("Define o salário " + i + ": ");
            salario = entrada.nextDouble();
            somaDosSalarios += salario;
        }

        double mediaSalarial = somaDosSalarios / numeroDeSalarios;

        System.out.println("A média salarial da empresa é: " + mediaSalarial);

        entrada.close();
    }
}
