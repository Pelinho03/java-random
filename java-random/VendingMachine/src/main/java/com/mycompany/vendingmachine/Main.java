package com.mycompany.vendingmachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();

        Produto p1 = new Produto("Bebida", 2.50, 10);
        Produto p2 = new Produto("Chocolate", 1.75, 5);
        Produto p3 = new Produto("Batatas", 1.50, 7);
        Produto p4 = new Produto("Snack", 2.00, 4);

        vendingMachine.adicionarProduto(p1);
        vendingMachine.adicionarProduto(p2);
        vendingMachine.adicionarProduto(p3);
        vendingMachine.adicionarProduto(p4);

        while (true) {
            System.out.println("\nEscolhe uma opcao: "
                    + "\n-------------------------"
                    + "\n1... Listar produtos"
                    + "\n2... Inserir dinheiro"
                    + "\n3... Comprar produto"
                    + "\n4... Sair"
                    + "\n-------------------------"
                    + "\nVisualizar lista (1) -> Inserir dinheiro (2) -> e escolher o produto em seguida (3).");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> vendingMachine.listarProdutos();
                case 2 -> {
                    System.out.println("Digite a quantia de dinheiro para inserir:");
                    double quantia = scanner.nextDouble();
                    vendingMachine.inserirDinheiro(quantia);
                }
                case 3 -> {
                    System.out.println("Digite o numero do produto que deseja comprar:");
                    int produtoIndice = scanner.nextInt();
                    vendingMachine.comprarProduto(produtoIndice);
                }
                case 4 -> {
                    System.out.println("Ate a proxima...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opcao invalida.");
            }
        }
    }
}
