package lesson4;

public class Programm {
    public static void main(String[] args) {
        Dog palkan1 = new Dog("Palkan");
        Dog palkan2 = new Dog("Sharik", 10);
        Dog palkan3 = palkan1;
        palkan3.age = 20;
        palkan1.bark();
        palkan1.bark("Vova");
        palkan1.bark( 5, "Vova");
        palkan1.sleep();

        int age = palkan1.getAge();
        if(age < 15) {
            System.out.println("The age is less than 15 years.");
        }

        /*int a = 10;
        int b = 10;
        int c = a;
        c = 20;*/

        /*System.out.println(a == b);
        System.out.println(palkan1 == palkan2);
        System.out.println(palkan1 == palkan3);*/

        System.out.println("Palkan1 age: " + palkan1.getAge());
        System.out.println("Palkan2 age: " + palkan2.getAge());
        System.out.println("Palkan3 age: " + palkan3.getAge());

        System.out.println("Dog count: " + Dog.counter);
        Dog.someMethod();
    }
}
