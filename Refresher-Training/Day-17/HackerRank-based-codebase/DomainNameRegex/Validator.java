package DomainNameRegex;

import java.io.*;
import java.util.*;
import java.util.regex.*;


public class Validator {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Set<String> domains = new TreeSet<>();

        String regex = "https?://(?:www2?\\.)?((?:[A-Za-z0-9-]+\\.)+[A-Za-z-]+)";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                domains.add(matcher.group(1));
            }
        }

        System.out.println(String.join(";", domains));

    }
}