package fourth_lesson;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class firtst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedMap<Long, Long> map = new TreeMap<>();
        int n = scanner.nextInt();
        long d, a;
        for (int i = 0; i < n; ++i) {
            d = scanner.nextLong();
            a = scanner.nextLong();
            if (!map.containsKey(d)) {
                map.put(d, a);
            } else {
                long y = map.get(d) + a;
                map.put(d, y);
            }
        }
        for (long i: map.keySet()) {
             System.out.println(i + " " + map.get(i));
        }
    }
}
