package lesson3;

public class R_Cast {
    public static void main(String[] args) {
        int a = 23;
        long b = a;

        long c = 34;
        c = 54_334_534_534_534L;
        int d = (int) c;
        System.out.println(d);
        int variable = 3;
        System.out.println( (float) variable/2);
    }
}
