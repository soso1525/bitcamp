package bitcamp.java100.ch14.ex3;

import java.io.IOException;
import java.io.OutputStream;

public class MyDataOutputStream {
    OutputStream worker;

    public MyDataOutputStream(OutputStream worker) { // 가장 상위를 받음으로써 서브클래스들도 이용할 수 있게
        this.worker = worker;
    }

    public void writeUTF(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        // 문자열의 바이트 개수도 2바이트로 표현 -> 문자열 길이를 넉넉하게 받기 위해서
        worker.write(bytes.length >> 8);
        worker.write(bytes.length);
        worker.write(bytes);
    }

    public void writeInt(int value) throws IOException {
        worker.write(value >> 24);
        worker.write(value >> 16);
        worker.write(value >> 8);
        worker.write(value);
    }
}
