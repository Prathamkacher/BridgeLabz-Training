import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        while(p-- > 0) {

            int type = sc.nextInt();

            if(type == 1) {
                int x = sc.nextInt();
                stack1.push(x);
            }
            else if(type == 2) {
                if(stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }
                stack2.pop();
            }
            else{
                if(stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }
                System.out.println(stack2.peek());
            }
        }
        sc.close();
    }
}