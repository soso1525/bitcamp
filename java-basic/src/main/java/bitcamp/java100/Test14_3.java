package bitcamp.java100;

public class Test14_3{
    public static void main(String[] args) {
        class BitStudent {
            String name, school, address, phone, email, major;
            char gender;
            int age;
            Boolean studyExp;
        }

        BitStudent s = new BitStudent();
        s.name = "JungSoHyun";
        s.school = "HUFS";
        s.address = "Wirye";
        s.phone = "01026896813";
        s.email = "j.sohyun2150@gmail.com";
        s.major = "I.C.E";
        s.age = 25;
        s.gender = 'W';
        s.studyExp = true;

        System.out.println("\n****** Student Info ******");
        System.out.println("Name: " + s.name);
        System.out.printf("Age: %dyear\tSex: %c\n", s.age, s.gender);
        System.out.printf("School: %s\tMajor: %s\n",s.school, s.major);
        System.out.println("Address: " + s.address);
        System.out.println("Phone: " + s.phone);
        System.out.println("Email: " + s.email);
        System.out.println("Studyy Experience: " + s.studyExp);
        

    }
}