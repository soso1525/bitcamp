package bitcamp.java100;

/* 반복문  - for */

public class Test16_6 {
    public static void main(String[] args) {
        // System.out.println("\n======================\n");
        //
        // for (int i = 0; i < 5; i++) {
        // System.out.println(i);
        // }
        //
        // System.out.println("\n======================\n");
        //
        // for (int i = 0, j = 0; i < 5; i++, j += 2) { // 같은 타입의 변수만 여러개 사용될 수 있음
        // System.out.printf("%d, %d\n", i, j);
        // }
        //
        // System.out.println("\n======================\n");
        // int sum = 0;
        // for (int i = 1; i <= 10; i++)
        // sum += i;
        // System.out.println("1 ~ 10 까지의 합: " + sum);
        //
        // System.out.println("\n======================\n");
        //
        // for (int i = 1; i <= 10; i++) {
        // System.out.print("=> ");
        // System.out.println(i);
        // }
        //
        // System.out.println("\n======================\n");
        //
        // for(int i=0; i<10; i++) {
        // if(i == 5) break;
        // System.out.println(i);
        // }
        //
        // System.out.println("\n======================\n");
        // for (int i = 0; i < 10; i++) {
        // if (i == 5)
        // continue; //5는 출력안함!
        // System.out.println(i);
        // }
        //
        // System.out.println("\n======================\n");
        // int i = 0;
        // for (; i < 5; i++) { //for문 조건식 비어도 됨 >> 전부 다 비우면 무한루프
        // System.out.println(i);
        // }
        //
        // System.out.println("\n======================\n");
        // int i = 0;
        // for (; i < 5;) {
        // System.out.println(i);
        // i++;
        //
        // }
        // System.out.println("\n======================\n");
        // int i = 0;
        // for (;;) {
        // System.out.println(i);
        // i++;
        // if (i == 5)
        // break;
        // }
        //
        // System.out.println("\n======================\n");
        // String[] names = { "홍길동", "임꺽정", "유관순", "안중근", "윤봉길" };
        // for (int i = 0; i < names.length; i++) {
        // System.out.println(names[i]);
        // }
        //
        // for(int i=1; i<=5; i++) {
        // for(int j=1; j<=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        //
        // label1: for (int i = 1; i <= 5; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // if (j == 2)
        // break label1;
        // }
        // System.out.println();
        // }

        int v = 98761234;
        for (int i = v; i != 0; i /= 10) {
            System.out.print(i % 10 + " ");
        }

    }
}
