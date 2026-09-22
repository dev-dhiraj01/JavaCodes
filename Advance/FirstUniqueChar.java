import java.util.LinkedHashMap;
public class FirstUniqueChar {
    
    public static void main(String args[]) {

        String str = "Leetcode";


        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();


        for (char ch : str.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if (ch == ' ')
                continue;
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        System.out.println(map);
        
        int count = 0;
        for (int i : map.values()) {
            if (i <= 2) {
                System.out.println(count);
                break;
            }
            count++;
        }

    }
}

