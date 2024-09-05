package com.mycompany.validouser;

import java.util.Scanner;

public class ValidoUser {

    public static void senhaOpcao(int codigo, Scanner entrada) {
        int senha;
        if (codigo == 1234) {
            System.out.print("\nCodigo correto. Insira a senha de acesso: ");
            senha = entrada.nextInt();
            if (senha == 9999) {
                System.out.println("\nAcesso permitido");
            } else {
                System.out.println("\nSenha incorreta");
            }
        } else {
            System.out.println("\nCodigo incorreto");
        }
    }

    public static void main(String[] args) {
        int codigo, opcao;
        try (Scanner entrada = new Scanner(System.in)) {
            do {
                System.out.print("\nInsira o codigo de acesso: ");
                codigo = entrada.nextInt();
                
                System.out.println("\nEscolha uma das opcoes:");
                System.out.println("1 - Validar codigo.");
                System.out.println("2 - Sair.");
                
                opcao = entrada.nextInt();
                switch (opcao) {
                    case 1 -> senhaOpcao(codigo, entrada);
                    case 2 -> System.out.println("\nObrigado por utilizar o programa.");
                        
                    default -> System.out.println("\nOpcao invalida! Por favor, escolha novamente.");
                }
                
            } while (opcao != 2);
        }
    }
}
