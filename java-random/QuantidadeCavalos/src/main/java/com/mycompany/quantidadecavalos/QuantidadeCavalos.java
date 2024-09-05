package com.mycompany.quantidadecavalos;

import java.util.Scanner;

public class QuantidadeCavalos {

    public static double calcCavalos(double m, double h, double t) {
        return ((m * h / t) / 745.6999);
    }

    public static void main(String[] args) {
        double m, h, t, cavalos;
        Scanner leia = new Scanner(System.in);

        System.out.println("Atribui um valor para quilogramas.");
        m = leia.nextDouble();
        System.out.println("Atribui um valor para altura.");
        h = leia.nextDouble();
        System.out.println("Atribui um valor para segundos.");
        t = leia.nextDouble();

        cavalos = calcCavalos(m, h, t);

        System.out.printf("A quantidade de cavalos necessarios e %.2f", cavalos);
    }
}
