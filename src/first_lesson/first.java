package first_lesson;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, i, c; // i - iteractor, r - code end, c - verdict
        r = scanner.nextInt();
        i = scanner.nextInt();
        c = scanner.nextInt();
        if (i == 0) {
            if (r != 0) {
                System.out.println(3);
            } else {
                System.out.println(c);
            }
        } else if (i == 1) {
            System.out.println(c);
        } else if (i == 4) {
            if (r != 0) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        } else if (i == 6) {
            System.out.println(0);
        } else if (i == 7) {
            System.out.println(1);
        } else {
            System.out.println(i);
        }
    }
}
