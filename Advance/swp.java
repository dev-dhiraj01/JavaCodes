import java.util.LinkedHashMap;

public class swp {
    public static void main(String args[]) {

        String str = "Hello Everyone";
        //we are hardcoding the object which hard cupling so instead of creating the object of linkedhashmap we need to create the object of Map 

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        // Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if(ch == ' ')
                continue;
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        System.out.println(map);
        System.out.println(map.values());

    }
}