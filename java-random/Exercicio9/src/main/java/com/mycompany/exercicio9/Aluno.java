package com.mycompany.exercicio9;

public class Aluno extends Pessoa {

    private int numAluno;
    private String turma;

    public int getNumAluno() {
        return numAluno;
    }

    public String getTurma() {
        return turma;
    }

    public Aluno() {
    }

    public Aluno(int numAluno, String turma, String nome, char genero, int idade) {
        super(nome, genero, idade);
        this.numAluno = numAluno;
        this.turma = turma;
    }

    @Override
    public void falar() {
        super.falar();
        System.out.println(" e sou um Aluno.");
    }

}
