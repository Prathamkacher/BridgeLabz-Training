package com.streams.bytearraystream;

import java.io.*;

public class ByteToImage {

    public static void writeBytesToImage(byte[] data, String outputPath)
            throws IOException {

        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        FileOutputStream fos = new FileOutputStream(outputPath);

        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = bais.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        fos.close();
    }
}
