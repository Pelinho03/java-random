package com.mycompany.animaisaula;

public class Animal {

    private String breed;
    private String color;
    private int age;
    private static int animalCount = 0;

    public Animal() {//há sempre um método construtor sem argumentos
        this.breed = " ";
        this.color = " ";
        this.age = 0;
        animalCount++;
    }

    public Animal(String breed, String color, int age) {//há sempre um método construtor com argumentos
        this.breed = breed;
        this.color = color;
        this.age = age;
        animalCount++;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public boolean sameBreed(Animal a) {
        return breed.equals(a.breed);
    }

    public void print() {
        System.out.println("Animais criados: " + animalCount);
        System.out.println("\nA raca e: " + breed);
        System.out.println("A cor  e: " + color);
        System.out.println("A idade e: " + age);
    }

}
