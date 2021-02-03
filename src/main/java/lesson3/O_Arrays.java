package lesson3;

public class O_Arrays {
    public static void main(String[] args) {
        /*int age = 30;
        int age2 = 40;*/

        int arr[] = {10, 20, 30, 35, 45, 50};
        int[] arr2 = {10, 20, 30, 35, 45, 50};
        arr[2] = 3000;

        boolean[] arrb = {true, false, true};
        String[] strArr = {"Hello", "world", "!!!!"};
        //int[] arrComp = {"Str", 4353, true};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[arr.length - 1]);
        System.out.printf("Length: '%d'", arr.length);


    }
}
