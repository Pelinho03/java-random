package com.mycompany.animaisaula;

import java.util.Scanner;

public class AnimaisAula {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Scanner strings = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println(""
                    + "\n***************"
                    + "\n1 - Dados Cao "
                    + "\n2 - Dados Gato"
                    + "\n3 - Sair"
                    + "\n***************");

            try {
                opcao = leia.nextInt();
            } catch (Exception e) {
                System.out.println("Opcao invalida. Ate a proxima.");
                System.exit(0); //termina o programa sem menssagem de erro (o erro acontece, porém, não é exibido)
            }

            switch (opcao) {
                case 1:
                    System.out.println("Introduz a raca: ");
                    String breed = strings.nextLine();

                    System.out.println("Introduz a cor: ");
                    String color = strings.nextLine();

                    System.out.println("Introduz a idade: ");
                    int age = leia.nextInt();

                    System.out.println("Introduz o tamanho: ");
                    String size = strings.nextLine();

                    Dog b = new Dog(breed, color, age, size);

                    b.print();
                    break;
                case 2:
                    System.out.println("Introduz a raca: ");
                    String breedCat = strings.nextLine();

                    System.out.println("Introduz a cor: ");
                    String colorCat = strings.nextLine();

                    System.out.println("Introduz a idade: ");
                    int ageCat = leia.nextInt();

                    System.out.println("Introduz o peso: ");
                    double weightCat = strings.nextDouble();

                    Cat c = new Cat(breedCat, colorCat, ageCat, weightCat);

                    c.print();
                    break;
                default:
                    System.out.println("Finalizado");
            }
        } while (opcao != 3);

        /* Animal a = new Animal();
        Dog b = new Dog("Street dog", "brown", 8, "Small");
        Cat c = new Cat("Garfield", "Orange", 2, 5.3);

        b.print();*/
        leia.close();
    }
}
