
package com.mycompany.orientado1;


public class Dog {
    
    private String breed;
    private String size;
    private int age;
    private String color;

    public Dog() {
    }

    public Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }
    
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed= breed;
    };
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size= size;
    };
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age= age;
    };
    public String getColor(){
        return color;
    };
    public void setColor(String color){
        this.color= color;
    };

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + ", size=" + size + ", age=" + age + ", color=" + color + '}';
    }

     public void print(){
         System.out.println("Breed: "+ breed);
         System.out.println("Size: "+ size);
         System.out.println("Age: "+ age);
         System.out.println("Color: "+ color);
     }

}
