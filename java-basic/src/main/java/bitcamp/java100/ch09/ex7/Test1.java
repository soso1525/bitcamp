package bitcamp.java100.ch09.ex7;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // ArrayList<String> list = new ArrayList<String>();
        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");

        System.out.println();

        for (Object s : list) // list의 데이터의 타입을 안적어주면 Object로 받기 때문에 출력할 때도 Object
            System.out.print(s + " ");
    }
}
