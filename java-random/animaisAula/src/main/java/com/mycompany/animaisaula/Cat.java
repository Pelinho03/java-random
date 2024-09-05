package com.mycompany.animaisaula;

public class Cat extends Animal {

    private double weight;

    //construtor sem argumentos
    public Cat() {
        this.weight = 0;
    }

    //construtor com argumentos
    public Cat(String breed, String color, int age, double weight) {
        super(breed, color, age);
        this.weight = weight;
    }

    public String compareWeight(Cat c) {
        if (this.weight > c.weight) {
            return "O primeiro gato e mais pesado.";
        } else if (this.weight < c.weight) {
            return "O segundo gato e mais pesado.";
        } else {
            return "Os dois gatos tem o mesmo peso.";
        }
    }

    @Override
    public void print() {
        super.print();
        System.out.println("O peso e: " + weight);
    }
}
