package bitcamp.java100;

public class Test12_7 {
    public static void main(String[] args) {
        float f1;
        f1 = 9876567f;
        System.out.println(f1);
        f1 = 9876543456789L;
        System.out.println(f1); //9876543600000 
        //원래 값과 비교했을 때 뒷자리 날라감 (오차 발생)
    }
}