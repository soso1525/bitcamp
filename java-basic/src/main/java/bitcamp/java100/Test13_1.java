package bitcamp.java100;
import java.util.*;

public class Test13_1 {
    public static void main(String[] args) {
        int kor, eng, math, soc, sci, eth, chi;
        kor = 100;
        eng = 100;
        math = 100;
        soc = 100;
        sci = 100;
        eth = 100;
        chi = 100;

        /*
            scores[0] = 
            scores[1] = 
            scores[2] = 
            scores[3] = 
            scores[4] = 
            scores[5] = 
            scores[6] = 
        */

        int[] scores = new int[7];

        // for(int i=0; i<scores.length; i++) {
        //     scores[i] = 100;
        // }

        for(int i=0; i<scores.length; i++) {
            scores[i] = new Scanner(System.in).nextInt();
        }

    }
}

