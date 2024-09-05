package com.mycompany.animaisaula;

public class Dog extends Animal { //extends para ir buscar tudo o que está na classe Animal, sendo esta filha de Animal

    private String size;

    //construtor sem argumentos
    public Dog() {
        this.size = " ";
    }

    //construtor com argumentos
    public Dog(String breed, String color, int age, String size) {
        super(breed, color, age);
        this.size = size;
    }

    public boolean sameSize(Dog d) {
        return size.equals(d.size);
    }

    @Override //sobrepor ao print da classe animal inserido todos os prints do Animal mais o print co Dog
    public void print() {
        super.print();
        System.out.println("O tamanho e: " + size);
    }
}
