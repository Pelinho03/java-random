package com.mycompany.exercicio1;

public class Pessoa {

    //Atributos
    String nome;
    char genero;
    int idade;

    //construtor sem parametros
    public Pessoa() {
    }

    //construtor com parametros
    public Pessoa(String nome, char genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public Pessoa(String nome, char genero, int idade) {
        //this.nome = nome;
        //this.genero = genero;
        this(nome, genero);//utiliza o construtor criado com 2 parametros
        this.idade = idade;
    }

    //Metodo falar
    void falar() {
        System.out.print("123456");
    }

}
