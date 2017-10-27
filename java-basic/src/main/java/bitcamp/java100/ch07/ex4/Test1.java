package bitcamp.java100.ch07.ex4;

public class Test1 {
    public static void main(String[] args) {

        Test1 obj = new Test1();

        if (obj instanceof Test1)
            System.out.println("obj는 Test1의 인스턴스이다.");
        if (obj instanceof Object)
            System.out.println("obj는 Object의 인스턴스이다");

        // System.out.println("Super class: " + Test1.class.getSuperclass());
        // System.out.println("Class package: " + Test1.class.getPackage());

        Class c = Test1.class;
        Class sc = c.getSuperclass();
        String name = sc.getName();
        System.out.println(name);

    }
}
    