package bitcamp.java100.ch09.ex7;

import java.util.HashMap;

public class Test9 {

    static class MyKey {
        String id, pwd;

        public MyKey(String id, String pwd) {
            this.id = id;
            this.pwd = pwd;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((id == null) ? 0 : id.hashCode());
            result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            MyKey other = (MyKey) obj;
            if (id == null) {
                if (other.id != null)
                    return false;
            } else if (!id.equals(other.id))
                return false;
            if (pwd == null) {
                if (other.pwd != null)
                    return false;
            } else if (!pwd.equals(other.pwd))
                return false;
            return true;
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
        // MyKey의 equals와 hashcode를 오버라이딩 함으로써
        // reference 값이 달라도 내용이 같으면 같은 객체로 인식
        // 따라서 k2로도 map에서 원하는 데이터를 가져올 수 있음
        System.out.println(map.get(k2));
    }
}
