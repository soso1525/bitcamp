package bitcamp.java100;

/* 비트 이동 연산자 응용 - int 메모리에 들어있는 값을 1바이트씩 앞에서부터 출력*/

public class Test15_12_2 {
    public static void main(String[] args) {
        int v = 1234567890;

        System.out.println(Integer.toHexString(v));
        
        //0xFF = 1111 1111 이렇게 두자리가 1바이트이므로 
        System.out.println(Integer.toHexString(v >> 24));
        System.out.println(Integer.toHexString((v >> 16) & 0xFF));
        System.out.println(Integer.toHexString((v >> 8) & 0xFF));
        System.out.println(Integer.toHexString(v & 0xFF));
    }
}