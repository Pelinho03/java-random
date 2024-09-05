package com.mycompany.registoaluno;

import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    String nome;
    int idade;
    double nota;
    
    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
}

public class RegistoAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        
        System.out.println("Registo do aluno");
        while (true) {
            System.out.print("Adiciona o nome do aluno (ou 'sair' para encerrar): ");
            String nome = input.nextLine();
            
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            
            System.out.print("Digita a idade do aluno: ");
            int idade = input.nextInt();
            System.out.print("Digita a nota do aluno: ");
            Double nota = input.nextDouble();
            input.nextLine();
            
            Aluno aluno = new Aluno(nome, idade, nota);
            listaAlunos.add(aluno);
            
            System.out.println("Aluno registado com sucesso!\n");
        }
        
        if(listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno registado.");
        } else {
            System.out.println("Lista de Alunos resgistados:");
            for (Aluno aluno : listaAlunos) {
                System.out.println("Nome: " + aluno.nome);
                System.out.println("Idade: " + aluno.idade);
                System.out.println("Nota: " + aluno.nota);
                System.out.println();
            }
        }
       input.close();
    }
}
