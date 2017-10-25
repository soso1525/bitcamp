package bitcamp.java100;

/* 반복문  */

public class Test16_4 {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 5) {
            System.out.println(i);
            // System.out.println(i++);
        }

        System.out.println("\n========================\n");

        i = 0;
        while (i < 5) {
            System.out.print("=> ");
            System.out.println(i);
            i++;
        }

        System.out.println("\n========================\n");

        i = 1;
        while (i <= 5) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        }

        System.out.println("\n========================\n");

        i = 1;
        while (i <= 5) {
            int count = 5 - i;
            while (count-- > 0)
                System.out.print(" ");
            count = 1;
            while (count++ <= i)
                System.out.print("*");
            System.out.println();
            i++;
        }

        System.out.println("\n========================\n");

        i = 1;
        while (i <= 3) {
            int count = 5 - i;
            count /= 2;

            while (count-- > 0)
                System.out.print(" ");

            count = 2 * i - 1;
            while (count-- > 0) {
                System.out.print("*");
            }

            System.out.println();
            i++;
        }

        System.out.println("\n========================\n");

        i = 1;
        while (i <= 5) {
            int count = (5 - i) / 2;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }

            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }

            System.out.println();
            i += 2;
        }

        System.out.println("\n========================\n");

        i = 1;
        label1: {
            while (i <= 10) {
                int count = 1;
                while (count <= i) {
                    System.out.print("*");
                    if (count == 5)
                        break label1;
                    count++;
                }
                System.out.println();
                i++;
            }
        }

        System.out.println("\n========================\n");

        i = 1;
        label1: while (i <= 10) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                if (count == 5)
                    break label1;
                count++;
            }
            System.out.println();
            i++;
        }

        System.out.println("\n\n**** 숫자 뒤에서부터 출력 **** \n");
        int num = 987654321;
        while (num != 0) {
            System.out.print(num % 10 + " ");
            num = num / 10;
        }

        System.out.println("\n\n**** 숫자 뒤에서부터 출력  (feat. 배열) **** \n");

        int[] cnt = new int[10];
        int num2 = 4885323;

        while (num2 != 0) {
            int last = num2 % 10; //뒤에서부터 한자리 자른 값을 대입
            num2 /= 10; //마지막 한자리 자르기 위해 나누기 10

            cnt[last]++;
            // cnt[last] += 1;
            // cnt[num2 % 10] += 1;

        }

        for (int t = 0; t < 10; t++) {
            System.out.println(t + " : " + cnt[t]);
        }
        
        /*int index = 0;
        while (index < cnt.length) {
            System.out.println(index + " = " + cnt[index]);
            index++;
        }*/
        
    }
}
