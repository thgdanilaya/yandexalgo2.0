package first_lesson;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n, maxx = 0, minn = 0, a;
        n = scanner.nextInt();
        if (n % 2 == 0) {
            for (int i = 1; i <= n; ++i) {
                a = scanner.nextInt();
                if (i == n / 2) {
                    minn = a;
                } else if (i == n / 2 + 1) {
                    maxx = a;
                }
            }
            System.out.println(maxx);
        } else {
            for (int i = 1; i <= n; ++i) {
                a = scanner.nextInt();
                if (i == (n+1) / 2) {
                    maxx = a;
                }
            }
            System.out.println(maxx);
        }
    }
}