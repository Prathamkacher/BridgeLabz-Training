package StaticBlockk;

import java.util.Scanner;

public class StaticBlock {

    static int B;
    static int H;

    static {
        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {

        if (B > 0 && H > 0) {
            System.out.println(B * H);
        }
    }
}