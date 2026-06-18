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
        marks.put("Nishant", 70);

        System.out.println(marks.get("Dhiraj"));
        marks.remove("Nishant");
        System.out.println(marks.containsKey("Pranav"));
        for (String key : marks.keySet()) {
            System.out.println(key);
        }
        for (Integer value : marks.values()) {
            System.out.println(value);
        }
        // checking a email contains gmail.com or not
        String email = "dhiraj@gmail.com";
        if (email.contains("gmail.com")) {
            System.out.println("Email is valid");
        }

        HashMap<String, Integer> salary = new HashMap<>();
        salary.put("m", 10000);
        salary.put("a", 20000);
        salary.put("b", 30000);
        System.out.println(salary.get("a"));
        System.out.println(salary.containsKey("manish"));

        for (String key : salary.keySet()) {
            System.out.println(key);
            break;
        }

        // 1count character frequency in a hashmap
        String name = "Dhiraj";
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (charFrequency.containsKey(c)) {
                charFrequency.put(c, charFrequency.get(c) + 1);
            } else {
                charFrequency.put(c, 1);
            }
        }
        System.out.println("Character frequency: ");
        System.out.println(charFrequency);

        // 2find first non repeating character in a string
        String str1 = "Dhiraj";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (charCount.get(c) == 1) {
                System.out.println("First non repeating character is: " + c);
                break;
            }
        }

        //3 find duplicate element in an array
        int[] arr = { 1, 2, 3, 4, 5, 1, 2 };
        HashMap<Integer, Integer> numCount = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (numCount.containsKey(num)) {
                numCount.put(num, numCount.get(num) + 1);
            } else {
                numCount.put(num, 1);
            }
        }
        for (Integer key : numCount.keySet()) {
            if (numCount.get(key) > 1) {
                System.out.println("Duplicate element is: " + key);
            }
        }

        // 4 count frequency of words in a string
        String sentence = "Aman is a good boy Aman is a good boy";
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        System.out.println(wordFrequency);

        // 5 check if two strings are anagrams using hashmap
        String str2 = "listen";
        String str3 = "silent";
        HashMap<Character, Integer> charCount1 = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (charCount1.containsKey(c)) {
                charCount1.put(c, charCount1.get(c) + 1);
            } else {
                charCount1.put(c, 1);
            }
        }
        HashMap<Character, Integer> charCount2 = new HashMap<>();
        for (int i = 0; i < str3.length(); i++) {
            char c = str3.charAt(i);
            if (charCount2.containsKey(c)) {
                charCount2.put(c, charCount2.get(c) + 1);
            } else {
                charCount2.put(c, 1);
            }
        }
        if (charCount1.equals(charCount2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

    }
}