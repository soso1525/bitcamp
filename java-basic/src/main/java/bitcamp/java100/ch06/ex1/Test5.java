package bitcamp.java100.ch06.ex1;

public class Test5 {
    public static void main(String[] args) {

        /*
         * Score3 score = new Score3(); System.out.println("이름 =" + score.name);
         * System.out.println("총점=" + score.sum); System.out.println("평균=" +
         * score.aver);
         */

        Score4 score = new Score4("홍길동", 50, 50, 50);
        System.out.println("이름=" + score.name);
        System.out.println("총점=" + score.sum);
        System.out.println("평균=" + score.aver);

    }
}
