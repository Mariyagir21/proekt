import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Klava2 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input forbidden symbols:");
        String forbidden = scanner.nextLine();
        System.out.println("Input lines:");
        while (true) {
            String line = scanner.nextLine();
            if (line.contains("#"))
                break;
            for (char c : line.toCharArray())
                if (forbidden.indexOf(c) < 0)
                    map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
            for (char key : map.keySet())
                System.out.println(key + " " + map.get(key));
        }
    }
}








