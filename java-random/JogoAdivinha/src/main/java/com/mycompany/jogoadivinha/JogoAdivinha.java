package com.mycompany.jogoadivinha;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int maxTentativas = 10;
        
        System.out.println("Bem-vindo ao jogo de adivinha o número!");
        System.out.println("Tenta adivinhar o número entre 1 e 100.");
        
        while (tentativas < maxTentativas) {
            System.out.print("Tentativa " + (tentativas + 1) + ": Digita uma suposição: ");
            int suposicao = scanner.nextInt();
            tentativas++;
            
            if (suposicao < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else if (suposicao > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número " + numeroAleatorio + " em " + tentativas + " tentativas!");
                break; // Sai do loop se adivinhar corretamente
            }
            
            if (tentativas == maxTentativas) {
                System.out.println("Você atingiu o número máximo de tentativas. O número correto era " + numeroAleatorio + ".");
            }
        }
        
        scanner.close();
    }
}