package bitcamp.java100.ch14.ex4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/* Object Stream - Serialization */

public class Test2_2 {
    public static void main(String[] args) throws Exception {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test2.dat"));

        Score3 s = (Score3) in.readObject(); // object instance >> byte array

        in.close();

        System.out.println(s);
    }
}
