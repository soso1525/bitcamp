package bitcamp.java100;

/* 로컬 변수의 생명주기 */

// local variable의 주소값을 리턴할 수 없음 -> just return value

public class Test17_15 {

    static int m1() {
        int a = 100;
        int b = 200;
        int c = a + b;
        return c;
    }

    static int[] m2() {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        return arr;
    }

    public static void main(String[] args) {

        int r1 = m1();
        System.out.println(r1);
        
        int[] r2 = m2(); //배열은 reference값으로 접근하는데 여기서 m2호출이 끝나도 배열에 접근할 수 있는 것은 heap영역에 생기기 때문
        for(int n:r2) 
            System.out.print(n + " ");

    }
}
