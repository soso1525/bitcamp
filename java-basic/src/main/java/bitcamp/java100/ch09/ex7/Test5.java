package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test5 {

    static class Contact {
        String name;
        String email;
        String tel;

        public Contact(String name, String email, String tel) {
            this.name = name;
            this.email = email;
            this.tel = tel;
        }
    }

    public static void main(String[] args) {

        HashSet<Contact> set = new HashSet<Contact>();

        Contact c1 = new Contact("홍길동", "hong@test.com", "1111-1111");
        Contact c2 = new Contact("홍길동", "hong@test.com", "1111-1111");
        Contact c3 = new Contact("홍길동", "hong@test.com", "1111-1111");

        // 인스턴스 변수인 name, email, tel을 각각 비교하면 같다고 나오지만
        // Contact 인스턴스 단위로 비교하면 다르다고 나옴
        // String 클래스만 오버라이딩 되어 있는 특징때문
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c2 == c3);

        System.out.println();

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        System.out.println();

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));

        System.out.println();

        set.add(c1);
        set.add(c2);
        set.add(c3);

        // String s1 = "홍길동";
        // String s2 = "임꺽정";
        // String s3 = "유관순";

        // set.add(s1);
        // set.add(s2);
        // set.add(s3);
        //
        // set.add(s1);
        // set.add(s2);
        // set.add(s3);
        //
        // set.add(null);
        // set.add(null);

        System.out.println(set.size());

        Contact[] arr = new Contact[set.size()];
        set.toArray(arr);
//        Object[] arr = set.toArray(); //set을 배열로 만들어 arr에 저장한다는 뜻
        for (Object c : arr) {
            System.out.println("****");
            System.out.println(((Contact)c).name + ", " + ((Contact)c).email + ", " + ((Contact)c).tel);
        }

        // String[] arr = new String[set.size()];
        // String[] arr2 = set.toArray(arr);
        //
        // if (arr == arr2)
        // System.out.println("arr == arr2");
        // else
        // System.out.println("arr != arr2");

        // for (String s : arr) {
        // System.out.print(s + " ");
        // }

        System.out.println();
    }
}
