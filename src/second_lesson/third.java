package second_lesson;

import java.util.Scanner;


public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int flag; // если длина слова четная то 1, если нет то 0
        int ukaz1, ukaz2; // указатели
        int ans = 0;
        s = scanner.next();
        int len = s.length();
        flag = len % 2;
        int mid = len / 2;
        if (flag == 1) {
            ukaz1 = mid + 1;
        } else {
            ukaz1 = mid;
        }
        ukaz2 = mid - 1;
        for (int i = 0; i < len / 2; ++i) {
            if (s.charAt(ukaz1) != s.charAt(ukaz2)) {
                ans += 1;
            }
            ukaz1 += 1;
            ukaz2 -= 1;
        }
        System.out.println(ans);
    }
}
