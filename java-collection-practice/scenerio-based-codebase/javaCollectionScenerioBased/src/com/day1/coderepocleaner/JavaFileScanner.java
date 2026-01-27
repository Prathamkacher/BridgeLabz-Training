package com.day_1.coderepocleaner;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class JavaFileScanner {

    public static List<Path> scanJavaFiles(String rootDir) throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(rootDir))) {
            return paths
                    .filter(p -> p.toString().endsWith(".java"))
                    .collect(Collectors.toList());
        }
    }
}
