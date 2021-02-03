package lesson4;

public class Dog {
    String name = "Palkan";
    String color = "grey";
    int age = 10;
    static int counter = 0;

    public Dog(){
        System.out.println("Crated new instance of the Dog!");
        Dog.counter++;
    }

    public Dog(String name){
        this();
        this.name = name;
    }

    public Dog(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        System.out.println("I will give you my age");
        return age;
    }

    public void bark() {
        System.out.println("Bark-bark from " + this.name );
    }

    public void bark(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println("Bark-bark ...");
        }
    }

    public void bark(String personName) {
        System.out.println(personName + " Bark-bark ...");
    }

    public void bark(int amount, String personName) {
        for (int i = 0; i < amount; i++) {
            System.out.println(personName + " Bark-bark ...");
        }
    }

    public void sleep() {
        System.out.println("I am sleeping ...");
    }

    static public void someMethod() {
        System.out.println("Some static method");
    }
}
