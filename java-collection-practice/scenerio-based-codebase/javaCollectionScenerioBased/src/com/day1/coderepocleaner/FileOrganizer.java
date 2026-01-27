package com.day_1.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileOrganizer {

    public static void organize(Map<FileType, List<Path>> map, String baseDir) throws IOException {

        for (FileType type : map.keySet()) {
            Path dir = Paths.get(baseDir, type.name());
            Files.createDirectories(dir);

            for (Path file : map.get(type)) {
                Files.copy(file, dir.resolve(file.getFileName()),
                        StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }
}
