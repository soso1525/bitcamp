package bitcamp.java100;

/* 비트연산자 */

public class Test15_11_2 {
    public static void main(String[] args) {

        // 파일 정보 저장
        // 디렉토리 여부, 소유주/그룹/기타 사용자의 읽기, 쓰기 , 실행 권한 정보

        // 메모리 설계
        /*class Privilege {
            boolean isDirectory;

            boolean ownerRead;
            boolean ownerWrite;
            boolean ownerExe;

            boolean groupRead;
            boolean groupWrite;
            boolean groupExe;

            boolean otherRead;
            boolean otherWrite;
            boolean otherExe;
        }*/

        boolean[] arr = new boolean[10];
        arr[0] = false;
        arr[1] = true;
        arr[2] = true;
        arr[3] = true;
        arr[4] = true;
        arr[5] = false;
        arr[6] = true;
        arr[7] = true;
        arr[8] = false;
        arr[9] = true;

        // 사용 권한 검사
        // if(p1.isDirectory) sysout("d") else sysout("-")
        System.out.print(arr[0] ? "d" : "-");
        System.out.print(arr[1] ? "r" : "-");
        System.out.print(arr[2] ? "w" : "-");
        System.out.print(arr[3] ? "x" : "-");
        System.out.print(arr[4] ? "r" : "-");
        System.out.print(arr[5] ? "w" : "-");
        System.out.print(arr[6] ? "x" : "-");
        System.out.print(arr[7] ? "r" : "-");
        System.out.print(arr[8] ? "w" : "-");
        System.out.print(arr[9] ? "x" : "-");
        System.out.println();
    }
}