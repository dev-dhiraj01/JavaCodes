
public class StringsMethods {
    public static void main(String[] args) {
        
        String str = "DhiIraj";
        

        int count = 0;
        for(char ch : str.toCharArray()){
            ch = Character.toLowerCase(ch);
            if( ch > 'a' && ch < 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'e' && ch != 'o' && ch != 'u' )
            count++;
        }

        char[] chars = str.toCharArray();

        int s = 0;
        int e = str.length()-1;
        
        while(s < e){
            
            char temp = chars[s];
            chars[s] = chars[e];
            chars[e] = temp;
            
            s++;
            e--;
        }
        String pal = "Madam";

        s = 0;
        e = pal.length()-1;
        boolean flag = true;
        pal = pal.toLowerCase();
        while(s < e){

            if(pal.charAt(s) == pal.charAt(e)){
                s++;
                e--;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");

        }
        System.out.println(count);
        System.out.println(chars);

        String a = "a hello ";
        String b = "a";
        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(a.charAt(0));
        System.out.println(a.contains("he"));
        System.out.println(a.substring(3, 6));
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
        String n = a.replaceAll("[a-z]", "9");
        System.out.println(n);
        System.out.println(a.concat(b));

        a = "apple";
        b = "banana";

        System.out.println(a.compareTo(b));
    }
}
