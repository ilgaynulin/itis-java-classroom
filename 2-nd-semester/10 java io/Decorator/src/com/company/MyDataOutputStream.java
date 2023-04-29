package com.company;

import java.io.IOException;
import java.io.OutputStream;

public class MyDataOutputStream {
    OutputStream outputStream;

    public MyDataOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void writeInt(int i) throws IOException {
        System.out.println(Integer.toBinaryString(i));
        byte[] bytes = new byte[4];
        bytes[0] = (byte) i;
        i = i >> 8;
        bytes[1] = (byte) i;
        i = i >> 8;
        bytes[2] = (byte) i;
        i = i >> 8;
        bytes[3] = (byte) i;

        outputStream.write(bytes);
    }
}
