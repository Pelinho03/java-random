package com.mycompany.programapessoas;

import java.util.Scanner;

public class ProgramaPessoas {

    public static void main(String[] args) {
        int sexo, qtMulheres = 0, qtHomens = 0;
        float altura, somaH = 0, mediaHomens = 0, maior = 0, menor = 0;
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Escolhe o sexo da pessoa (1-Mulher) (2-Homem) n." + i + " de 4.");
            sexo = leia.nextInt();
            System.out.println("Escreve uma altura");
            altura = leia.nextFloat();

            if (sexo == 1) {
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
                somaH += altura;
            } else {
                System.out.println("Opcao invalida!");
            }

            if (altura > maior) {
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }
        }
        mediaHomens = somaH / qtHomens;
        System.out.println("A maior altura e: " + maior);
        System.out.println("A menor altura e: " + menor);
        System.out.println("A media de alturas dos homens e: " + mediaHomens);
        System.out.println("O numero de mulheres e: " + qtMulheres);
        
        leia.close();
    }
}
