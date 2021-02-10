package lesson4;

public abstract class Animal {

    public abstract void eat();
    /*public abstract void eat(String name);
    public abstract void eat(String name, int age);
    public abstract void eat(String name, int age, boolean bool);*/

    public void sleep() {
        System.out.println("I am sleeping");
    }

    protected void protectedMethod() {
        System.out.println("I am a PROTECTED method");
    }

    void packageDefaultMethod() {
        System.out.println("I am a PACKAGE DEFAULT method");
    }
}
