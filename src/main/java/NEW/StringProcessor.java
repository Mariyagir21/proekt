package NEW;
import java.util.HashMap;


public class StringProcessor {
    private final String forbidden;
    private final String stopWorld;
    HashMap<Character, Integer> map;


    public StringProcessor(String forbidden, String stopWorld) {
        this.forbidden = forbidden;
        this.stopWorld = stopWorld;
        this.map = new HashMap<>();
    }

    public boolean process(String line) {
        if (line.contains(stopWorld))
            return true;
        for (char c : line.toCharArray())
            if (forbidden.indexOf(c) < 0)
                map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        for (char key : map.keySet())
            System.out.println(key + " " + map.get(key));
        return false;

    }
}



