package bitcamp.java100.ch14.ex2;

public class Test2_4 {
    public static void main(String[] args) throws Exception {

        int[] data = new int[4000000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 100000); // Class명.method - static / class method
        }

        MyBufferedOutputStream out = new MyBufferedOutputStream("./test2.dat");

        long start = System.currentTimeMillis();

        for (int b : data) {
            out.write(b);
        }

        out.flush(); // 이거 없으면 데이터 용량 차이 생김

        long end = System.currentTimeMillis();

        System.out.println("걸린시간 = " + (end - start));
        out.close();
    }
}
