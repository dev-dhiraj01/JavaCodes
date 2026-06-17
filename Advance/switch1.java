
public class switch1 {
     public static void main(String[] args) {
        int ch = 1;
        int ch1 = 1;

        switch(ch){
            case 1 : System.out.println("sunday");
                    break;

            case 2 : System.out.println("monday");
                 break;
          
               case 3 : System.out.println("tuesday");
                 break;
               case 4 : System.out.println("wednesday");
                 break;
               case 5 : System.out.println("thursday");
                 break;
               case 6 : System.out.println("friday");
                 break;
               case 7 : System.out.println("saturday");
                 break;
        }
        System.out.println(ch1 == 1 ? "hello" : "bye");
     }
}
