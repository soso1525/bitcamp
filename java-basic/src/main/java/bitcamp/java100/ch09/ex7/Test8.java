package bitcamp.java100.ch09.ex7;

import java.util.HashMap;

public class Test8 {

    static class MyKey {
        String id, pwd;

        public MyKey(String id, String pwd) {
            this.id = id;
            this.pwd = pwd;
        }
    }

    static class Contact {
        String name, email, tel;

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
        HashMap<MyKey, Contact> map = new HashMap<MyKey, Contact>();

        Contact c1 = new Contact("홍길동", "hong@test.com", "1111-1111");

        MyKey k1 = new MyKey("aaaa", "1111");
        map.put(k1, c1);
        System.out.println(map.get(k1));

        MyKey k2 = new MyKey("aaaa", "1111");
        System.out.println(map.get(k2)); //k1과 k2가 다른 객체로 인식하고 있음
        
        // get() 메서드가 MyKey 객체를 가지고 데이터를 찾을 때,
        // hashCode()의 리턴 값이 같고,
        // equals()의 리턴값이 true인 
        // 그 키로 저장된 데이터를 리턴한다 -> 보완해서 Test9.java
    }
}
