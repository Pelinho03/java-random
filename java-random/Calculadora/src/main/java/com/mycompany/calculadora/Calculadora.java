package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--------------------------");
        System.out.println("---CALCULADORA DA SORTE---");
        System.out.println("--------------------------");
        System.out.print("Insere o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("--------------------------");
        
        System.out.print("Insere o segundo número ");
        double num2 = scanner.nextDouble();
        System.out.println("--------------------------");
        
        System.out.print("Escolher o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        System.out.println("--------------------------");
        
        scanner.close();
        double result;
        
        switch(operador) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return;  
        }
        System.out.println("--------------------------");
        System.out.println("--O RESULTADO DA SORTE É--");
        System.out.println("--------------------------");
        System.out.println(num1 + " " + operador + " " + num2 + ": " + result);
    }
}
