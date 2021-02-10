package lesson4;

public class Horse extends Animal{
    private String name = "";
    private int age = 10;

    public Horse() {
    }

    public Horse(String name) {
        this.name = name;
    }

    public Horse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*@Override
    public void eat() {
        System.out.println("I am eating !!!!");
    }*/

    @Override
    public void eat() {
        System.out.println("I am eating !!!! ");
    }

    public void sleep() {
        super.sleep();
        System.out.println("I am NOT sleeping !!!!");
    }

}
