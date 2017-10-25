package bitcamp.java100;

import java.io.Console;

public class Test21_4 {
    public static void main(String[] args) {

        class Student {
            String name;
            int age;
            boolean working;
            float gpa;

            void showInfo() {
                System.out.println("name: " + name);
                System.out.println("age: " + age);
                System.out.println("working: " + working);
                System.out.println("gpa: " + gpa);
            }
        }

        Console console = System.console();
        Student s = new Student();
        s.name = console.readLine("이름?(예: 홍길동) ");
        s.age = Integer.valueOf(console.readLine("나이?(예: 20) "));
        s.working = Boolean.valueOf(console.readLine("재직여부?(예: t/f) "));
        s.gpa = Float.valueOf(console.readLine("졸업학점?(예: 4.3) "));

        System.out.println("정보출력 >>>>>>>>>>> ");
        s.showInfo();
    }
}
