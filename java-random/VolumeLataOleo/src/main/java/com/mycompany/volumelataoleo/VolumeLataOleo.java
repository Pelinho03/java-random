package com.mycompany.volumelataoleo;

import java.util.Scanner;

public class VolumeLataOleo {

    public static double calcVolume(double v, double r, double a) {
        return (v * r * r * a);
    }

    public static void main(String[] args) {
        double v, r, a, volume;
        Scanner leia = new Scanner(System.in);

        System.out.println("Vamos medir o volume de uma lata de oleo.");
        System.out.println("\nInsere um valor para o raio da lata.");
        r = leia.nextDouble();
        System.out.println("\nInsere um valor para a area da lata.");
        a = leia.nextDouble();

        v = 3.14159;
        volume = calcVolume(v, r, a);

        System.out.printf("O volume da lata de oleo e de %.2f" , volume , "m³");

    }
}
