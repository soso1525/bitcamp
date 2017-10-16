package bitcamp.java100;

import java.util.ArrayList;

public class Test17_7 {

    static ArrayList m1() {
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add(20);
        list.add(false);
        list.add(4.12f);
        list.add('M');

        return list; // 객체의 주소 리턴
    }

    public static void main(String[] args) {
        ArrayList a = m1();

        for (Object o : a) {
            System.out.println(o);
        }
    }
}
