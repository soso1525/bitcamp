package bitcamp.java100.ch06.ex3;

public class MyClass3 {
    static int v1 = 100;

    static void m1() {
        System.out.println(v1);
    }

    // static block (instance 블록이랑 다르게 static 키워드가 들어감)
    static {
        System.out.println("MyClass3의 static 블록 실행!");
        v1 = 300;
    }
    
    static {   
        System.out.println("MyClass3의 static 블록 실행222");
    }
}
