package bitcamp.java100.ch08.ex8;

// 오버로딩의 기준을 상속유무로 나누면 안된다
// 파라미터를 다르게 하는 것 자체를 오버로딩이라하고
// 오버라이딩은 똑같이 만드는 것 


public class B extends A {
    void m1(float a) { // 오버로딩 (파라미터가 달라졌음)
        System.out.println("B의 m1(float)");
    }
}
