
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
    }
}
