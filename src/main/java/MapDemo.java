import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Character, String> map = new HashMap<>();

        map.put('T', "Thịnh");
        map.put('A', "Anh");
        map.put('D', "Dungx");

        for(Map.Entry<Character, String> pair : map.entrySet()){
            System.out.println("getKey = " + pair.getKey());
            System.out.println("getValue = " + pair.getValue());
        }
    }
}
