package bitcamp.java100;

import java.util.ArrayList;
import java.util.HashSet;

/* for-each문  */

public class Test16_7 {
    public static void main(String[] args) {
        String[] names = { "홍길동", "임꺽정", "유관순", "안중근", "윤봉길" };

        for (String s : names)
            System.out.println(s);

        System.out.println("\n===================\n");
 
        int[] kor = { 100, 90, 80, 90, 50, 80 };
        for (int score : kor) {
            System.out.println(score);
        }

        System.out.println("\n===================\n");

        ArrayList<String> list = new ArrayList<String>();
        for (String s : names)
            list.add(s);
        for (String s : list)
            System.out.println(s);

        System.out.println("\n===================\n");
        HashSet<String> set = new HashSet<String>();
        for (String s : names)
            set.add(s);

        for (String s : set)
            System.out.println(s); //hash value에 따라 출력
    }
}
