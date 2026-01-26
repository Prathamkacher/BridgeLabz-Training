package com.streams.bytearraystream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ImageCopyMain {

    public static void main(String[] args) {

        String originalImage = "src/com/streams/bytearraystream/input.jpg";
        String copiedImage = "src/com/streams/bytearraystream/output.jpg";

        try {
            byte[] imageBytes =
                    ImageToByte.convertImageToBytes(originalImage);

            ByteToImage.writeBytesToImage(imageBytes, copiedImage);

            byte[] original =
                    Files.readAllBytes(Paths.get(originalImage));
            byte[] copied =
                    Files.readAllBytes(Paths.get(copiedImage));

            System.out.println(
                Arrays.equals(original, copied)
                ? "Images are identical."
                : "Images are NOT identical."
            );

        } catch (IOException e) {
            System.out.println("Error processing image.");
        }
    }
}
