package bitcamp.java100.ch09.ex7;

import java.util.HashMap;
import java.util.Iterator;

/* HashMap */

public class Test15 {

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

        map.put("aaa", c1);
        map.put("bbb", c2);
        map.put("ccc", c3);

        Iterator<Contact> it1 = map.values().iterator();
        Iterator<String> it2 = map.keySet().iterator();
        while (it1.hasNext() && it2.hasNext()) {
            System.out.println("Key: " + it2.next());
            System.out.println("Value: " + it1.next());
        }

    }
}
