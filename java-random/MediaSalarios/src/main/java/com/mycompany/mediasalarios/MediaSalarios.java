package com.mycompany.mediasalarios;

import java.util.Scanner;

public class MediaSalarios {

    public static int lerSalarios(int nfunc, Scanner leia) {
        int soma = 0;
        for (int i = 0; i < nfunc; i++) {
            System.out.println("Digite o salario do funcionario " + (i + 1));
            int salario = leia.nextInt();
            soma += salario;
        }
        return soma;
    }

    public static double calcularMedia(int soma, int nfunc) {
        return (double) soma / nfunc;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos funcionarios tem a empresa?");
        int nfunc = leia.nextInt();

        int soma = lerSalarios(nfunc, leia);
        double media = calcularMedia(soma, nfunc);

        System.out.println("A media de salarios de " + nfunc + " funcionarios e: " + media);
    }
}
