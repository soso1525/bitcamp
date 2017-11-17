package bitcamp.java100.ch16.ex1;

public class Test4 {
    static class MyThread extends Thread {

        public MyThread(String name) {
            super(name); // 스레드에 이름 붙이는 생성자가 있음
        }

        @Override
        public void run() {
            int count = 0;
            while (true) {
                System.out.println("\n" + this.getName() + " : " + (++count));
                if (count == 500) {
                    count = 0;
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new MyThread("꽃님이").start();

        while (true) {
            System.out.print(" . ");
            double v1 = 3.141592;
            double v2 = 0.1234543;
            for (int i = 0; i < 1000000; i++) {
                v1 *= Math.random();
                v2 /= Math.random();
            }
        }
    }
}
