
public class Ver03 {
    public static void main(String[] args) {
        String name = "홍 길 동";
        int kor = 100;
        int eng = 97;
        int math = 98;

        int sum = kor + eng + math;
        float aver = sum / 3.0f;

        System.out.printf("이 름: %s\n", name);
        System.out.printf("국 어: %d\n", kor);
        System.out.printf("영 어: %d\n", eng);
        System.out.printf("수 학: %d\n", math);
        System.out.printf("총 점: %d\n", sum);
        System.out.printf("평 균: %f\n", aver);
        System.out.printf("평 균: %.1f\n", aver); 

    }
} 
   