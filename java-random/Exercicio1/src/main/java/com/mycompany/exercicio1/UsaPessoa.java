package com.mycompany.exercicio1;

import java.util.Scanner;

public class UsaPessoa {

    public UsaPessoa() {
    }

    public static void usa() {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Paulo";
        pessoa1.genero = 'M';
        pessoa1.idade = 24;

        System.out.println(""
                + "A pessoa chama-se " + pessoa1.nome
                + ", do genero " + pessoa1.genero
                + ", e tem " + pessoa1.idade + " anos."
                + " e diz ");
        pessoa1.falar();

        Pessoa pessoa2 = new Pessoa("Ruben", 'M');
        pessoa2.idade = 25;

        System.out.println(""
                + "\nA pessoa chama-se " + pessoa2.nome
                + ", do genero " + pessoa2.genero
                + ", e tem " + pessoa2.idade + " anos."
                + " e diz ");
        pessoa2.falar();

        Scanner leia = new Scanner(System.in);

        System.out.println("\nInsere o nome da pessoa 3:");
        String nome = leia.nextLine();
        System.out.println("Insere o genero da pessoa 3:");
        char genero = leia.next().charAt(0);
        System.out.println("Insere o idade da pessoa 3:");
        int idade = leia.nextInt();

        Pessoa pessoa3 = new Pessoa(nome, genero, idade);
        System.out.println(""
                + "\nA pessoa chama-se " + pessoa3.nome
                + ", do genero " + pessoa3.genero
                + ", e tem " + pessoa3.idade + " anos."
                + " e diz ");
        pessoa3.falar();

    }

}
