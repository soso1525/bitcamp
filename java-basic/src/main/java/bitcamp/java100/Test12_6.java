package bitcamp.java100;

public class Test12_6 {
    public static void main(String[] args) {
        byte b1 = 50;
        byte b2 = 50;
        byte b3;
        b3 = 100;

        //b3 = b1 + b2; compile error

        //상수랑 리터럴 구분짓기 (상수는 fianl 변수)

        // b3 = 50 + 50; //리터럴 + 리터럴 = 리터럴 (리터럴끼리 연산결과는 리터럴)
        // b3 = b1 + 50; // 변수 + 리터럴 = int형 정수

        short s1;
        // s1 = b1 + b2; //byte라서가 아니라 연산 결과가 int형이므로 short형에 못들어감
    }
}