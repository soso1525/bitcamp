package bitcamp.java100.ch06.ex3;

/* static member / satic field */

public class Test1 {
    public static void main(String[] args) {

        System.console().readLine("계속 실행하려면 엔터를 치세요");

        System.out.println(MyClass.v1); // MyClass의 v1을 사용함으로써 이 때 클래스를 사용
        // 클래스를 사용 = 클래스가 메모리에 로딩

        System.console().readLine("계속 실행하려면 엔터를 치세요");
        
        MyClass.v1 += 200;

        System.out.println(MyClass.v1);
    }
}
