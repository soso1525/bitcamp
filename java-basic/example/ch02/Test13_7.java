package bitcamp.java100;

public class Test13_7 {
    public static void main(String[] args) {
        int a =100;
        int b;
        
        b = a; // a의 값을 b에 저장 (a의 값을 복사해서 b에 저장)
        b = 200; // a와 b는 다른 메모리

        int[] arr1 = {100, 200, 300};
        int[] arr2;

        arr2 = arr1;

        arr2[1] = 50;

        for(int num : arr1) 
            System.out.print(num + ", ");
    }
}