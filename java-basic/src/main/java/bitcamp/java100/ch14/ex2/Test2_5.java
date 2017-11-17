package bitcamp.java100.ch14.ex2;

import java.io.FileOutputStream;

public class Test2_5 {
    public static void main(String[] args) throws Exception {

        int[] data = new int[4000000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 100000); // Class명.method - static / class method
        }

        FileOutputStream out = new FileOutputStream("./test6.dat");
        //위임 형태 (실제 출력은 FileOutputStream 객체에서 알아서 할 일)
        MyBufferedOutputStream2 out2 = new MyBufferedOutputStream2(out); 

        long start = System.currentTimeMillis();

        for (int b : data) {
            out2.write(b);
        }

        out2.flush(); // 이거 없으면 데이터 용량 차이 생김

        long end = System.currentTimeMillis();

        System.out.println("걸린시간 = " + (end - start));
        out.close();
    }
}
