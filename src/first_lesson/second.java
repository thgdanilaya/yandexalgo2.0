package first_lesson;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, j;
        n = scanner.nextInt();
        i = scanner.nextInt();
        j = scanner.nextInt();
        if (i > j) {
            int buffer = j;
            j = i;
            i = buffer;
        }
        System.out.println(Math.min(n- 2 - (j - i - 1), j - i - 1));
    }
}