package com.mycompany.seriefibonacci;

import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número até o qual deseja calcular a série de Fibonacci: ");
        int numeroLimite = scanner.nextInt();
        
        int primeiroNumero = 0;
        int segundoNumero = 1;
        
        System.out.println("Série de Fibonacci até " + numeroLimite + ":");
        
        while (primeiroNumero <= numeroLimite) {
            System.out.print(primeiroNumero + " ");
            int proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        }
        
        scanner.close();
    }
}
