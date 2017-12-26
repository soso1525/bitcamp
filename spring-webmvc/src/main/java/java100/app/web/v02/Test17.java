package java100.app.web.v02;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

@Controller
@RequestMapping("/v02/test17")
public class Test17 {

    // test > http://localhost:9999/spring-webmvc/v02/test17.html

    @RequestMapping("/m1")
    public String m1(@RequestBody String json) {

        // JSON to Java object (library 사용)

        @SuppressWarnings("rawtypes")
        Map obj = new Gson().fromJson(json, Map.class);

        System.out.println("name : " + obj.get("name"));
        System.out.println("age  : " + obj.get("age"));
        System.out.println("tel  : " + obj.get("tel"));
        System.out.println("email: " + obj.get("email"));
        System.out.println("--------------------------------");

        return "/hello.jsp";
    }

    class User {
        String name;
        int age;
        String tel;
        String email;

    }

    @RequestMapping("/m2")
    public String m2(@RequestBody String json) {

        // JSON to Java object (library 사용)

        @SuppressWarnings("rawtypes")
        User user = new Gson().fromJson(json, User.class);

        System.out.println("name : " + user.name);
        System.out.println("age  : " + user.age);
        System.out.println("tel  : " + user.tel);
        System.out.println("email: " + user.email);
        System.out.println("--------------------------------");

        return "/hello.jsp";
    }

    public static class User2 {
        String name;
        int age;
        String tel;
        String email;

//        public User2() {}
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    @RequestMapping(value = "/m3")
    public String m3(@RequestBody User2 user) {

        System.out.println("name : " + user.name);
        System.out.println("age  : " + user.age);
        System.out.println("tel  : " + user.tel);
        System.out.println("email: " + user.email);
        System.out.println("--------------------------------");

        return "/hello.jsp";
    }
}
