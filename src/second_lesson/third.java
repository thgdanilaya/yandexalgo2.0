package second_lesson;

import java.util.Scanner;



public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        boolean flag = false; // если длина слова четная то 1, если нет то 0
        int ukaz1, ukaz2; // указатели
        int ans = 0;
        s = scanner.next();
        int len = s.length();
        if (len % 2 == 1) {
            flag = true;
        }
        int mid = len / 2;
        if (flag) {
            ukaz1 = mid - 1;
            ukaz2 = mid + 1;
        } else {
            ukaz1 = mid;
            ukaz2 = mid-1;
        }
        for (int i = 0; i < len / 2; ++i ) {
            if (s.charAt(ukaz1) != s.charAt(ukaz2)) {
                ans += 1;
            }
            ukaz1 -=1;
            ukaz2 +=1;
        }
        System.out.println(ans);
    }
}
