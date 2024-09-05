package com.mycompany.salariofuncionarios2;

import java.util.Scanner;

public class SalarioFuncionarios2 {

    public static double calcularMedia(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }

    public static void main(String[] args) {
        double n1, n2, n3, n4, media;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor do salario 1: ");
        n1 = entrada.nextDouble();
        System.out.print("Valor do salario 2: ");
        n2 = entrada.nextDouble();
        System.out.print("Valor do salario 3: ");
        n3 = entrada.nextDouble();
        System.out.print("Valor do salario 4: ");
        n4 = entrada.nextDouble();

        media = calcularMedia(n1, n2, n3, n4);

        System.out.println("A média de salários é: " + media);

        entrada.close();
    }
}
