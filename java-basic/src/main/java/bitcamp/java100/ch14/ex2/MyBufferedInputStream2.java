package bitcamp.java100.ch14.ex2;

import java.io.IOException;
import java.io.InputStream;

/* File Input Stream이 아님! */
// 상속 X 

public class MyBufferedInputStream2 {

    InputStream worker; // 실제 일하는 놈

    byte[] buf = new byte[8192];
    int len;
    int cursor;

    public MyBufferedInputStream2(InputStream worker) {
        this.worker = worker;
    }

    public int read() throws IOException {
        if (cursor >= len) {
            cursor = 0;
            len = worker.read(buf);
            if (len == -1)
                return -1;
        }

        return buf[cursor++] & 0x000000FF;
    }
}
