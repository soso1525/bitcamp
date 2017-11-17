package bitcamp.java100.ch16.ex1;

public class Test3 {

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println("MyRunnable => " + i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyRunnable());
        t.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
            Thread.sleep(1);
        }
    }
}
