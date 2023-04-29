package com.company;

import java.io.IOException;
import java.io.InputStream;

public class MyDataInputStream {
    InputStream inputStream;

    public MyDataInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public int readInt() throws IOException {
        byte[] bytes = inputStream.readNBytes(4);
        int i;
        i = bytes[3] + bytes[2] << 8 + bytes[1] << 16 + bytes[0] << 24;
        return i;
    }
}
