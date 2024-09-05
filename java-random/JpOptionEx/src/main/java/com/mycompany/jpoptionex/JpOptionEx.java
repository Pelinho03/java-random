package com.mycompany.jpoptionex;

import javax.swing.JOptionPane;

public class JpOptionEx {

    public static void main(String[] args) {
        int n, qt = 0, maior = 0, menor = 0;
        double media = 0;
        long s = 0, p = 0, i = 0;

        n = lerNumero();

        while (n != 0) {
            qt++;
            s += n;

            if (ePar(n)) {
                p++;
            } else if (eImpar(n)) {
                i++;
            }

            if (maiorQueCem(n)) {
                maior++;
            } else {
                menor++;
            }

            media = calcularMedia(s, qt);

            n = lerNumero();
        }

        exibirResultado(qt, s, p, i, maior, menor, media);
    }

    private static int lerNumero() {
        return Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Indica um número: <br><em>(valor 0 interrompe)</em></html>"));
    }

    private static boolean ePar(int n) {
        return n % 2 == 0;
    }

    private static boolean eImpar(int n) {
        return !ePar(n);
    }

    private static boolean maiorQueCem(int n) {
        return n > 100;
    }

    private static double calcularMedia(long s, int qt) {
        return (double) s / qt;
    }

    private static void exibirResultado(int qt, long s, long p, long i, int maior, int menor, double media) {
        JOptionPane.showMessageDialog(null,
                "<html><h1><font color=\\\"#64c0c9\\\" size=\\\"5\\\">Resultado final</font></h1> <br><hr>"
                + "<br>Total de Valores = " + qt
                + "<br>Somatório = " + s
                + "<br>Total de pares = " + p
                + "<br>Total de Ímpares = " + i
                + "<br>Maior que 100 = " + maior
                + "<br>Menor que 100 = " + menor
                + "<br>Média dos valores = " + media
                + "</html>");
    }
}
