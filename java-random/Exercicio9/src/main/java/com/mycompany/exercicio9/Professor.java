package com.mycompany.exercicio9;

public class Professor extends Pessoa {

    private int grupoDocencia;
    private int escalao;

    public int getGrupoDocencia() {
        return grupoDocencia;
    }

    public int getEscalao() {
        return escalao;
    }

    public Professor() {
    }

    public Professor(int grupoDocencia, int escalao, String nome, char genero, int idade) {
        super(nome, genero, idade);
        this.grupoDocencia = grupoDocencia;
        this.escalao = escalao;
    }

    @Override
    public void falar() {
        super.falar();
        System.out.println(" e sou um professor.");
    }

}
