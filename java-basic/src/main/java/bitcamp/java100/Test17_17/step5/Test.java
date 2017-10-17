package bitcamp.java100.Test17_17.step5;

public class Test {

    public static void main(String[] args) {
        Rect rect;
        rect = new Rect();
        rect.width = 390;
        rect.height = 420;

        float area = Rect.area(rect);
        float pyeong = Rect.pyeong(rect);
        System.out.println(area);
        System.out.println(Rect.area(rect));
        System.out.println(pyeong);
        System.out.println(Rect.pyeong(rect));

    }
}
