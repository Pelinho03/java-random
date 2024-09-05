package com.mycompany.dicionario;

import java.util.HashMap;
import java.util.Scanner;

public class Dicionario {
    public static void main(String[] args) {
        HashMap<String, String> dicionario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma palavra (ou 'sair' para encerrar): ");
            String palavra = scanner.nextLine();

            if (palavra.equalsIgnoreCase("sair")) {
                break; // Encerra o loop
            }

            System.out.print("Digite o significado da palavra: ");
            String significado = scanner.nextLine();

            dicionario.put(palavra, significado);
            System.out.println("Palavra adicionada ao dicionário.");
        }

        // Recupere o significado de uma palavra
        System.out.print("Digite uma palavra para obter o significado: ");
        String palavraParaPesquisar = scanner.nextLine();
        String significado = dicionario.get(palavraParaPesquisar);
        if (significado != null) {
            System.out.println("Significado de '" + palavraParaPesquisar + "': " + significado);
        } else {
            System.out.println("A palavra '" + palavraParaPesquisar + "' não está no dicionário.");
        }

        // Itere sobre todas as palavras no dicionário
        System.out.println("Palavras no dicionário:");
        for (String chave : dicionario.keySet()) {
            System.out.println(chave + ": " + dicionario.get(chave));
        }

        scanner.close(); // Fecha o scanner quando não for mais necessário
    }
}
