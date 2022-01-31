package second_lesson;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a;
        int sum = 0, max = 0;
        n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            a = scanner.nextInt();
            if (a > max) {
                max = a;
            }
            sum += a;
        }
        System.out.println(sum - max);
    }
}
