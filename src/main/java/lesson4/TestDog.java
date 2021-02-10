package lesson4;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setAge(-15);

        int expectedAge = 11;
        int actualAge = dog.getAge();

        if(expectedAge != actualAge) {
            throw new Error("Test failed");
        } else {
            System.out.println("Test passed");
        }

        Dog dog2 = new Dog();

        dog2.setAge(15);

        int expectedAge2 = 15;
        int actualAge2 = dog2.getAge();

        if(expectedAge2 != actualAge2) {
            throw new Error("Test failed");
        } else {
            System.out.println("Test passed");
        }

    }
}
