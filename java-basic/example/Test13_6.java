package bitcamp.java100;

public class Test13_6 {
    public static void main(String[] args) {
        
        int[] arr1; // 배열의 주소를 저장하는 레퍼런스 변수
        
        //new(operator)로 생성한 메모리 
        arr1 = new int[3]; // instance or object
        
        arr1 = new int[5]; 

        //arr1을 새로 할당받은 메모리를 가리키면서
        //위에서 할당받은 메모리가 쓰레기가 됨 (garbage) >> GC가 처리
    }
}