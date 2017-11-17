package bitcamp.java100.ch14.ex2;

import java.io.FileOutputStream;

public class Test2_3 {
    public static void main(String[] args) throws Exception {

        byte[] data = new byte[4000000];
        for (int i = 0; i < data.length; i++) {
            // byte라서 255를 넘어갈 수 없음
            data[i] = (byte) (Math.random() * 255); 
        }

        FileOutputStream out = new FileOutputStream("./test3.dat");

        long start = System.currentTimeMillis();

        for (int i = 0; i < data.length; i += 8192) {

            // if (data.length - i > 8192)
            // out.write(data, i, 8192);
            // else
            // out.write(data, i, data.length - i);

            out.write(data, i, (data.length - i > 8192 ? 8192 : data.length - i));
        }

        long end = System.currentTimeMillis();

        System.out.println("걸린시간 = " + (end - start));
        out.close();
    }
}
