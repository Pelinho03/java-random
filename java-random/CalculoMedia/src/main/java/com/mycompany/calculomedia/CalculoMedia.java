package com.mycompany.calculomedia;

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Este programa calcula a média de um conjunto de numeros.");
        System.out.print("Quantos numeros desejas inserir? ");
        int qtNumeros = input.nextInt();
        
        if(qtNumeros <= 0){
            System.out.println("Por favor, insere um número válido.");
            return;
        }
        
        double soma = 0;
        
        for (int i=1; i<=qtNumeros; i++){
            System.out.print("Digita o " + i + "º número: ");
            double numero = input.nextDouble();
            soma += numero;
        }
        
        double media = soma / qtNumeros;
        
        System.out.println("A média dos numeros inseridos é: " + media);
        
        input.close();
        
    }
}
