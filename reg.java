import java.util.regex.*;

public class reg {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher("a7b@z#9");

        while(m.find()){
             System.out.println(m.start()+ ".." +m.group());
        }

        char n = 'a';
        switch(n){
            case 1:
                System.out.println("hello");
                break;
            case 'a':
                System.out.println("how are you");
        }

        System.out.println((n == 'a') ? "hello" : "bye");
    }
}
