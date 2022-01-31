package second_lesson;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l, k;
        int mid;
        int a; // для считывания
        int flag;
        boolean ans_flag = false;
        int ans_left = -1, ans_right = -1;
        boolean stop = false;
        l = scanner.nextInt();
        k = scanner.nextInt();
        mid = l / 2;
        flag = l % 2;
        for (int i = 0; i < k; ++i) {
            a = scanner.nextInt();
            if (a == mid && flag == 1) {
                ans_left = a;
                ans_flag = true;
            } else {
                if (a < mid) {
                    ans_left = a;
                } else {
                    if (!stop) {
                        ans_right = a;
                        stop = true;
                    }
                }
            }
        }
        if (ans_flag) {
            System.out.println(ans_left);
        } else {
            System.out.println(ans_left + " " + ans_right);
        }
    }
}
