import java.util.HashMap;

class day4 {
    public static void main(String[] args) {
        String str = "Dhiraj";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        
        System.out.println(str.replace('a', 'x'));
        System.out.println(str.toUpperCase());

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Dhiraj", 90);
        marks.put("Pranav", 80);
        marks.put("Nishant",70);

        System.out.println(marks.get("Dhiraj"));
        marks.remove("Nishant");
        System.out.println(marks.containsKey("Pranav"));
        for(String key : marks.keySet()){
            System.out.println(key);
        }
        for(Integer value : marks.values()){
            System.out.println(value);
        }
        //checking a email contains gmail.com or not
        String email = "dhiraj@gmail.com";
        if(email.contains("gmail.com")){
            System.out.println("Email is valid");
        }

        HashMap<String, Integer> salary = new HashMap<>();
        salary.put("m", 10000);
        salary.put("a", 20000);
        salary.put("b", 30000);
        System.out.println(salary.get("a"));
        System.out.println(salary.containsKey("manish"));
        
    }
}