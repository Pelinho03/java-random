package com.mycompany.loopteste;

import java.util.Arrays;

public class LoopTeste {

    public static void main(String[] args) {

        /*  String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        double v[] = {1.2, 1.0, 3, 5, 2.9, 10.4};

        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mes de " + mes[c] + " tem " + tot[c] + " dias.");
        }

        for (String valor : mes) {
            System.out.println(valor + " ");
        }

        Arrays.sort(v);
        for (double vetor : v) {
            System.out.print(vetor + " ");*/
        int total = 0;
        int c[] = new int[13];
        for (int i = 0; i < c.length; i++) {
            c[i] = i + i;
        }
        for (int i = 0; i < c.length; i++) {
            total += c[i];
        }
        System.out.println(total);
    }
}
