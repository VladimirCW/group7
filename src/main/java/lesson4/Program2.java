package lesson4;

import lesson3.Mouse;

public class Program2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Horse horse = new Horse();
        Car car = new Car();
        Mouse mouse = new Mouse();
        dog.setAge(15);
        // dog.age = -15;
        System.out.println(dog.getAge());

        dog.sleep();
        horse.sleep();
        horse.protectedMethod();
        horse.packageDefaultMethod();

        horse.eat();

        //Animal animal = new Animal();

        System.out.println(dog == dog1);

        System.out.println(dog.equals(dog1));
    }
}
