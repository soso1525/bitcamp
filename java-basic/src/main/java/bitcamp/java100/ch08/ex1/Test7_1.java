package bitcamp.java100.ch08.ex1;

class Member {
    String name;
    int age;
    float weight;
    float height;

}

public class Test7_1 {
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "홍길동";
        m.age = 20;
        
        //터무니 없는 값을 넣음으로써 추상화를 방해하며 전체 데이터 값을 왜곡시킬 수 있음
        m.weight = 900.7f;
        m.height = 16f;

        System.out.printf("%s, %d, %.2f, %.2f\n", m.name, m.age, m.weight, m.height);
    }
}
