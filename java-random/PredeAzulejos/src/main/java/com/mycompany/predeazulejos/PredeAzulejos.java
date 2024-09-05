package com.mycompany.predeazulejos;

import java.util.Scanner;

public class PredeAzulejos {

    public static double calcQtd(double hp, double lp, double ha, double la) {
        return ((hp*lp)/(ha*la));
    }

    public static void main(String[] args) {
        double hp, lp, ha, la, qtd;
        Scanner leia = new Scanner(System.in);

        System.out.println("Atribui uma altura para a parede em metros.");
        hp = leia.nextDouble();
        System.out.println("Atribui uma largura para a parede em metros.");
        lp = leia.nextDouble();
        System.out.println("Atribui uma altura para o azulejo em centimetros.");
        ha = leia.nextDouble();
        System.out.println("Atribui uma larguta para o azulejo em centimetros.");
        la = leia.nextDouble();

        System.out.println("\nAs dimenssoes escolhidas foram:");
        System.out.println("Altura da parede: " + hp);
        System.out.println("Largura da parede: " + lp);
        System.out.println("Altura do azulejo: " + ha);
        System.out.println("Largura do azulejo: " + la);

        qtd=calcQtd(hp, lp, ha, la);

        System.out.printf("\nA quantidade de azulejos necessarios sera de: %.2f", qtd);
    }
}
