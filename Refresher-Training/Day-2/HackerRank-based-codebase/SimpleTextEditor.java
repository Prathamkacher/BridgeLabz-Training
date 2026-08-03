import java.io.*;
import java.util.*;

public class SimpleTextEditor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        sc.nextLine();
        
        StringBuilder text = new StringBuilder();
        Stack<String> previous = new Stack<>();
        
        while (p-- > 0) {

            String operation = sc.nextLine();
            String[] parts = operation.split(" ");

            int type = Integer.parseInt(parts[0]);

            if (type == 1) {
                String str = parts[1];
                text.append(str);
                previous.push("2 " + str.length());
            }
            else if (type == 2) {

                int k = Integer.parseInt(parts[1]);
                String del = text.substring(text.length() - k);
                text.delete(text.length() - k, text.length());
                previous.push("1 " + del);
            }
            else if (type == 3) {
                int k = Integer.parseInt(parts[1]);
                System.out.println(text.charAt(k - 1));

            } else {
                String[] undo = previous.pop().split(" ");
                int undoType = Integer.parseInt(undo[0]);

                if (undoType == 1) {
                    text.append(undo[1]);
                } else {
                    int len = Integer.parseInt(undo[1]);
                    text.delete(text.length() - len, text.length());
                }
            }
        }
    }
}