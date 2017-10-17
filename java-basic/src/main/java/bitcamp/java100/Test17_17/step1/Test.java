package bitcamp.java100.Test17_17.step1;

public class Test {
    public static void main(String[] args) {

        // 단위 - cm
        int width = 390;
        int height = 420;

        // 단위 - m
        float area = (float) (width * height) / 100 / 100; // 정수 >> 부동소수점
        float pyeong = area / 3.3f;
        System.out.println(area);
        System.out.println(pyeong);
    }
}
