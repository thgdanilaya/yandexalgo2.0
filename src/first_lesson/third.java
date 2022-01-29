package first_lesson;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        if (x <= 12 && y <= 12 && x != y) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}