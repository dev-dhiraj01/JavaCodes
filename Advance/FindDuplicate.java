import java.util.Map;
import java.util.LinkedHashMap;

class FindDuplicate{
    public static void main(String args[]){

        int[] nums = {1,2,3,4,1,2,4,5};

        Map<Integer,Integer> duplicate = new LinkedHashMap<>();

        for(int num : nums ){
            duplicate.put(num,duplicate.getOrDefault(num,0)+1);
        }

        duplicate.forEach((k,v) ->{
            if(v == 2){
                System.out.println(k);
            }
        });

        String a = "a hello   ";
        String b = "a";
        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(a.charAt(0));
        System.out.println(a.contains("he"));
        System.out.println(a.substring(3,6));
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.trim());
        System.out.println(a.isEmpty());
        System.out.println(a.isBlank());
        boolean g = true;
        System.out.println(String.valueOf(g));
        System.out.println(a.startsWith("b"));
        System.out.println(a.endsWith("  "));
        System.out.println(a.toCharArray());
    }
}