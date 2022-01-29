package second_lesson;

import java.util.Scanner;

import static java.lang.Math.*;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        int[] v = new int[10];
        for (int i = 0; i < 10; ++i) {
            v[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; ++i) {
            if (v[i] == 1) {
                int len = 10;
                for (int j = 0; j < 10; ++j) {
                    if (v[j] == 2) {
                        if (abs(j - i) < len) {
                            len = abs(j - i);
                        }
                    }
                }
                if (len > ans && len != 10) {
                    ans  = len;
                }
            }
        }
        System.out.println(ans);
    }
}