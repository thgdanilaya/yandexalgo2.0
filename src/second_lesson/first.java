package second_lesson;

import java.util.Scanner;

import static java.lang.Math.*;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = 1, x = 0, y = 0;
        d = scanner.nextInt();
        while (d != 0) {
            if (d > x) {
                y = 1;
                x = d;
            } else if (d == x) {
                y += 1;
            }
            d = scanner.nextInt();
        }
        System.out.println(y);
    }
}