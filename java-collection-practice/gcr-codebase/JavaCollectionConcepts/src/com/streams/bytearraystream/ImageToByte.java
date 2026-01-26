package com.streams.bytearraystream;

import java.io.*;

public class ImageToByte {

    public static byte[] convertImageToBytes(String imagePath)
            throws IOException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        FileInputStream fis = new FileInputStream(imagePath);

        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, bytesRead);
        }

        fis.close();
        return baos.toByteArray();
    }
}
