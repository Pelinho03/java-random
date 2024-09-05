package com.mycompany.exercicio9;

public class Pessoa {

    //Atributos
    private String nome;
    private char genero;
    private int idade;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Metodo falar
    public void falar() {
        System.out.print("Sou uma pessoa");
    }

}
