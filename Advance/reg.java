import java.util.regex.*;

public class reg {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher("a7b@z#9");

        while(m.find()){
             System.out.println(m.start()+ ".." +m.group());
        }
    }
}
