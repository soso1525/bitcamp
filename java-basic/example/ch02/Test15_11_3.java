package bitcamp.java100;

/* 비트연산자 */

public class Test15_11_3 {
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

        int p1 = 0;
        p1 = 0b0_111_101_101;
        
        final int DIRECTORY = 0x200; //0b0010_0000_0000; 
        
        final int OWNER_READ = 0x100; //0b0001_0000_0000;
        final int OWNER_WRITE = 0x80; //0b0000_1000_0000;
        final int OWNER_EXE = 0x40; //0b0000_0100_0000;
        
        final int GROUP_READ = 0x20; //0b0000_0010_0000;
        final int GROUP_WRITE = 0x10; //0b0000_0001_0000;
        final int GROUP_EXE = 0x0008; //0b0000_0000_1000;
        
        final int OTHER_READ = 0x0004; //0b0000_0000_0100;
        final int OTHER_WRITE = 0x0002; //0b0000_0000_0010;
        final int OTHER_EXE = 0x0001; //0b0000_0000_0001;
        
        System.out.print((p1 & DIRECTORY) == DIRECTORY ? "d" : "-");
        System.out.print((p1 & OWNER_READ) == OWNER_READ ? "r" : "-");
        System.out.print((p1 & OWNER_WRITE) == OWNER_WRITE ? "w" : "-");
        System.out.print((p1 & OWNER_EXE) == OWNER_EXE ? "x" : "-");
        System.out.print((p1 & GROUP_READ) == GROUP_READ ? "r" : "-");
        System.out.print((p1 & GROUP_WRITE) == GROUP_WRITE ? "w" : "-");
        System.out.print((p1 & GROUP_EXE) == GROUP_EXE ? "x" : "-");
        System.out.print((p1 & OTHER_READ) == OTHER_READ ? "r" : "-");
        System.out.print((p1 & OTHER_WRITE) == OTHER_WRITE ? "w" : "-");
        System.out.print((p1 & OTHER_EXE) == OTHER_EXE ? "x" : "-");
        System.out.println();
    }
}