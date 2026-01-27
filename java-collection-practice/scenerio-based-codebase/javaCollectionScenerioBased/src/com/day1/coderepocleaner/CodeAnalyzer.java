package com.day_1.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class CodeAnalyzer {

    // camelCase method name check
    private static final Pattern METHOD_PATTERN =
            Pattern.compile("\\b(public|private|protected)\\s+\\w+\\s+([a-z][a-zA-Z0-9]*)\\s*\\(");

    private static final Pattern BAD_METHOD_PATTERN =
            Pattern.compile("\\b(public|private|protected)\\s+\\w+\\s+([A-Z_][a-zA-Z0-9_]*)\\s*\\(");

    private static final Pattern IMPORT_PATTERN =
            Pattern.compile("import\\s+([\\w\\.]+);");

    public static FileType analyzeFile(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);
        Set<String> imports = new HashSet<>();
        String content = String.join("\n", lines);

        boolean warning = false;
        boolean error = false;

        for (String line : lines) {
            Matcher imp = IMPORT_PATTERN.matcher(line);
            if (imp.find()) {
                imports.add(imp.group(1));
            }

            if (BAD_METHOD_PATTERN.matcher(line).find()) {
                warning = true; // naming issue
            }
        }

        // Check unused imports
        for (String imp : imports) {
            String simpleName = imp.substring(imp.lastIndexOf('.') + 1);
            if (!content.contains(simpleName + " ")) {
                warning = true;
            }
        }

        if (lines.isEmpty())
            error = true;

        if (error) return FileType.ERRORS;
        if (warning) return FileType.WARNINGS;
        return FileType.VALID;
    }
}
