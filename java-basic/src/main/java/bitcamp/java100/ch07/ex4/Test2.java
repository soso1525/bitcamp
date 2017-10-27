package bitcamp.java100.ch07.ex4;

class Test {
    
}

public class Test2 {
    public static void main(String[] args) {
        Test2 obj = new Test2();
        System.out.println(obj.toString());
        System.out.println(Integer.toHexString(obj.hashCode()));
        System.out.println(Integer.toHexString(Test.class.hashCode()));

        System.out.println();
        Test2 obj2 = new Test2();
        Test2 obj3 = obj2;
        System.out.println(obj.equals(obj2));
        System.out.println(obj2.equals(obj3));

        System.out.println();
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb1.equals(sb2));
        // string으로 형변환
        System.out.println(sb1.toString().equals(sb2.toString()));

        System.out.println();
        Class c = obj.getClass();
        System.out.println(c.getName());
    }
}
