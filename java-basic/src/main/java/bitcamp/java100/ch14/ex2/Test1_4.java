package bitcamp.java100.ch14.ex2;

public class Test1_4 {
    public static void main(String[] args) throws Exception {
        MyBufferedInputStream in = new MyBufferedInputStream("sample/jls9.pdf");

        int count = 0;

        long start = System.currentTimeMillis();
        int b = 0;
        while ((b = in.read()) != -1) {
            count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("읽은 바이트 수: " + count);
        System.out.println("걸린시간: " + (end - start));
        in.close();
    }
}
