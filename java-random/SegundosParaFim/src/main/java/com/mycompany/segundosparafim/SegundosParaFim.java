package com.mycompany.segundosparafim;

import java.util.Scanner;

public class SegundosParaFim {

    public static int qtdSegundos(int hora, int minuto, int segundo) {
        return (segundo + minuto * 60 + hora * 3600);
    }

    public static int faltamSegundos(int passado) {
        return (86400 - passado);
    }

    public static void main(String[] args) {
        int hora, minuto, segundo, passado, faltam;
        Scanner leia = new Scanner(System.in);

        System.out.println("Insere uma hora:");
        hora = leia.nextInt();
        System.out.println("Adiciona os minutos:");
        minuto = leia.nextInt();
        System.out.println("Agora os segundos:");
        segundo = leia.nextInt();

        passado = qtdSegundos(hora, minuto, segundo);
        faltam = faltamSegundos(passado);

        System.out.println("Ja se passaram " + passado + " segundos desde o inicio do dia.");
        System.out.println("Faltam " + faltam + " segundos para terminar o dia.");
    }
}
