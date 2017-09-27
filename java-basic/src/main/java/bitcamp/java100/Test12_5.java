package bitcamp.java100;

public class Test12_5 {
    public static void main(String[] args) {
        byte b1;  // byte: -128 ~ 127 
        b1 = 100;

        b1 = -128;
        b1 = 127;

        // b1 = -129; compile error
        // b1 = 128; compile error 
       
        short s1; //short(2byte): -32768 ~ 32767
        s1 = -32768;
        s1 = 32767;

        // s1 = -32769; compile error
        // s1 = 32768; compile error

        int i1; //int(4byte): -21_4748_3648 ~ 21_4748_3647
        i1 = -21_4748_3648;
        i1 = 21_4748_3647;

        // i1 = -21_4748_3649L;
        // i1 = 21_4748_3648L;

        // b1 = 100L;
        // s1 = 100L;
        // i1 = 100L;

        long l1; //long(8byte): -922_3372_0368_5477_5808 ~ 922_3372_0368_5477_5897
        l1 = -922_3372_0368_5477_5808L;
        l1 = 922_3372_0368_5477_5807L;
    }
} 