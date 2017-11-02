package bitcamp.java100.ch08.ex3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        ArrayList list = new ArrayList();

        while (true) {
            Score s = new Score();

            s.setNo(Prompts.inputInt("번호? "));
            // System.out.print("번호? ");
            // s.setNo(Integer.parseInt(keyScan.nextLine()));

            s.setName(Prompts.inputString("이름? "));
            // System.out.print("이름? ");
            // s.setName(keyScan.next());
            // s.setName(keyScan.nextLine());

            s.setKor(Prompts.inputInt("국어? "));
            // System.out.print("국어? ");
            // s.setKor(Integer.parseInt(keyScan.nextLine()));

            s.setEng(Prompts.inputInt("영어? "));
            // System.out.print("영어? ");
            // s.setEng(Integer.parseInt(keyScan.nextLine()));

            s.setMath(Prompts.inputInt("수학? "));
            // System.out.print("수학? ");
            // s.setMath(Integer.parseInt(keyScan.nextLine()));

            list.add(s);
            System.out.println(s.toString());

            if (!Prompts.confirm("계속 하시겠습니까? "))
                break;
        }
    }
}
