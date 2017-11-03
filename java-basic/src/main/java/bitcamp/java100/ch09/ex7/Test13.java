package bitcamp.java100.ch09.ex7;

import java.util.ArrayList;
import java.util.Iterator;

public class Test13 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        String s1 = "홍길동";
        String s2 = "임꺽정";
        String s3 = "유관순";

        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
