package lesson4;

public class Dog extends Animal{

    private int age = 10;

    String name = "Palkan";
    String color = "grey";
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

    public void setAge(int age) {
        if(age > 0 && age <=25 ) {
            this.age = age;
        } else {
            System.out.println(String.format("The age '%d' is unexcepted", age));
        }
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

    static public void someMethod() {
        System.out.println("Some static method");
    }

    @Override
    public void eat() {
        System.out.println("I am eating !!!!");
    }

    public boolean equals(Dog dog) {
        /*if (this.name.equals(dog.name) && this.age == dog.age) {
            return true;
        } else  {
            return false;
        }*/

        // return (this.name.equals(dog.name) && this.age == dog.age) ? true : false;
        return (this.name.equals(dog.name) && this.age == dog.age);
    }
}
