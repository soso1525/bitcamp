package bitcamp.java100.ch14.ex2;

import java.io.FileOutputStream;

public class Test2_2 {
    public static void main(String[] args) throws Exception {

        int[] data = new int[4000000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 100000); // Class명.method - static / class method
        }

        FileOutputStream out = new FileOutputStream("./test2.dat");

        long start = System.currentTimeMillis();

        for (int b : data) {
            out.write(b);
        }

        long end = System.currentTimeMillis();

        System.out.println("걸린시간 = " + (end - start));
        out.close();
    }
}
