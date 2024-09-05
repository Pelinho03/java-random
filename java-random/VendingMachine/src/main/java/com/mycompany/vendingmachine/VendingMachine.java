package com.mycompany.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Produto> produtos;
    private double saldo;

    public VendingMachine() {
        this.produtos = new ArrayList<>();
        this.saldo = 0;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        System.out.println("--------------LISTA DE PRODUTOS--------------");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(i + 1 + "| " + produtos.get(i));
        }
        System.out.println("---------------------------------------------");
    }

    public void inserirDinheiro(double quantia) {
        saldo += quantia;
        System.out.println("Saldo atual: " + saldo);
    }

    public void comprarProduto(int indice) {
        if (indice < 1 || indice > produtos.size()) {
            System.out.println("Produto inválido.");
            return;
        }

        Produto produto = produtos.get(indice - 1);

        if (saldo < produto.getPreco()) {
            System.out.println("Saldo insuficiente.");
        } else if (produto.getQuantidade() == 0) {
            System.out.println("Produto esgotado.");
        } else {
            saldo -= produto.getPreco();
            produto.setQuantidade(produto.getQuantidade() - 1);
            System.out.println("Acabaste de adquirir: " + produto.getNome());
            System.out.println("Troco: " + saldo);
            saldo = 0; // Reset saldo após a compra
        }
    }
}
