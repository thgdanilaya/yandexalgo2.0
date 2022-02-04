package fourth_lesson;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedMap<String, Integer> map = new TreeMap<>();
        String s;
        int n;
        while (scanner.hasNext()) {
            s = scanner.next();
            n = scanner.nextInt();
            if (!map.containsKey(s)) {
                map.put(s, n);
            } else {
                int y = map.get(s) + n;
                map.put(s, y);
            }
        }
        for (String i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }
    }
}
