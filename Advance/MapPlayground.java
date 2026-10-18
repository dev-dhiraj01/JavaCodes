//                                      Map
//                                       |
//     -------------------------------------------------------------------
//     |           |                   |                    |             |
// HashMap     TreeMap             EnumMap               LinkedHashMap   WeekHashMap

import java.util.Map;
import java.util.HashMap;

public class MapPlayground {
    
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("in", "India");
        map.put("us", "United States");
        map.put("uk", "United Kingdom");

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
