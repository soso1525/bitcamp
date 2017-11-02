package bitcamp.java100.ch09.ex7;

import java.util.HashMap;

/* HashMap */

public class Test7 {

    static class Contact {
        String name;
        String email;
        String tel;

        public Contact(String name, String email, String tel) {
            this.name = name;
            this.email = email;
            this.tel = tel;
        }

        @Override
        public String toString() {
            return "Contact [name=" + name + ", email=" + email + ", tel=" + tel + "]";
        }

    }

    public static void main(String[] args) {

        HashMap<String, Contact> map = new HashMap<String, Contact>();

        Contact c1 = new Contact("홍길동", "hong@test.com", "1111-1111");
        Contact c2 = new Contact("홍길동2", "hong2@test.com", "1111-1112");
        Contact c3 = new Contact("홍길동3", "hong3@test.com", "1111-1113");

        // 데이터를 저장할 때는 key - value 쌍으로

        map.put("aaa", c1);
        map.put("bbb", c2);
        map.put("ccc", c3);

        // 데이터를 꺼낼 때는 key 값을 이용
        System.out.println(map.get("aaa"));
        System.out.println(map.get("bbb"));
        System.out.println(map.get("ccc"));

        String key = new String("aaa");
        System.out.println("aaa" == key); // "aaa"자리에 인스턴스 레퍼런스 값이 들어감
        System.out.println("aaa".hashCode()); // string class의 hashcode 메소드
        System.out.println(key.hashCode());
        System.out.println("aaa".hashCode() == key.hashCode()); // true 인 이유는 string class 의 오버라이딩

        System.out.println(map.get(key));

    }
}
