package bitcamp.java100.ch14.ex4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/* Object Stream - Serialization */

public class Test2_1 {
    public static void main(String[] args) throws Exception {
        Score2 s = new Score2("홍길동", 800, 900, 1000);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test1.dat"));

        Score2 tmp = (Score2) in.readObject(); // object instance >> byte array

        in.close();

        System.out.println(tmp);
    }
}
