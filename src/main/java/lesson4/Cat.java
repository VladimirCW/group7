package lesson4;

public class Cat extends Animal{
    String name = "Barsik";

    public void meow() {
        System.out.println("Meow-meow");
    }

    @Override
    public void eat() {
        System.out.println("I am eating !!!!");
    }
}
