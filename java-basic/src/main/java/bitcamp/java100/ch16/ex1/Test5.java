package bitcamp.java100.ch16.ex1;

public class Test5 {
    static class Result {
        int sum;
    }

    static Result result = new Result();

    static class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (result) { // 한번에 한 result객체만 사용할 수 있도록 제한을 둠
                for (int i = 1; i < 11; i++) {
                    System.out.printf("%s(%d)\n", this.getName(), i);
                    result.sum += i;
                    try {
                        Thread.sleep(500); //이전에는 sleep하는 순간 뺏길 수 있는데 여기서는 synchronized되어 그럴 일 없음
                    } catch (Exception e) {
                    }
                }

                result.notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread("꽃님이");
        t.start();
        
        // 이 예제에서는 main 쓰레드와 MyThread 객체인 t스레드가 result 객체를 공유
        // 한쪽에서 wait이 들어가면 공유하는 객체에 대해 notify가 호출되기 전까지 기다림
        
        synchronized (result) {
            result.wait(); // t객체가 notify() 호출할 때까지 대기
            System.out.println("합계  = " + result.sum);
        }
    }
}
