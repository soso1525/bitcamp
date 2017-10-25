package bitcamp.java100.Test17_17.step6;

public class Rect {
    int width;
    int height;

    // 인스턴스 메소드 - 인스턴스의 필드만 다루는 메소드

    float area() {
        return (this.width * this.height) / 10000f;
    }

    float pyeong() {
        return (this.width * this.height) / 10000f / 3.3f;
    }

}