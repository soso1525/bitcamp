package bitcamp.java100;

public class Test13_3 {
    public static void main(String[] args) {
        int[] arr1;

        arr1 = new int[3];
        System.out.println(arr1.length);

        // arr1 = null;
        // System.out.println(arr1.length);

        arr1[-1] = 3;
        arr1[3] = 300;
        System.out.println(arr1[-1]);
        System.out.println(arr1[3]);
    }
}