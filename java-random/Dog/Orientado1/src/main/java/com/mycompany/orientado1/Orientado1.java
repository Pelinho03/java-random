package com.mycompany.orientado1;


public class Orientado1 {

    public static void main(String[] args) {
        
        Dog d1 = new Dog();
        
        Dog d2 = new Dog("Husky","M",1,"red");
        System.out.println(d1);
        System.out.println(d2);
        
        d2.print();
        
        d2.setColor("preto");
        
        d2.print();
        
        System.out.println("Qual a raça de d2? "+ d2.getBreed());
      
    }
}
