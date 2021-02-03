package lesson3;

public class L_logic_if_or_and {
    public static void main(String[] args) {
        int age = 30;
        int money = 100;

        //if(age < 18 && (age > 10 || money < 50) )
        // && fails on false   ---  false && true
        // || fails on true    ---  true || false


        if((age < 18) && (money > 50)) {
            System.out.println("Let's go to school and by a car");
        } else if (age < 60 || money > 100) {
            System.out.println("Let's go work and by a car");
        } else {
            System.out.println("Let's go retire");
        }
    }
}
