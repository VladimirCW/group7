package lesson3;

public class J_Math {
    public static void main(String[] args) {
        int a = 10;
        int b;
        //System.out.println(b);
        a = 20;
        b = 100;
        System.out.println(a);
        a = -50;
        System.out.println(a);

        int c = 50;
        int d = 2;

        int e = c + d;
        System.out.println(e);
        System.out.println(c + d);

        int f = c * d + a - (a + d)/d;

        int e1 = 13%5;
        System.out.println(e1);
        System.out.println("-----------------");

        int g = 1;
        g = g + 1;
        g +=1;
        g++;
        g--;
        g*=10;//g = g * 10
        g/=20; // g = g / 20
        System.out.println(g);
    }
}
