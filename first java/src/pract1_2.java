//findind the number from given array
public class pract1_2 {
    public static void main(String[] args) {
        System.out.println("NAME :-DHIRAJ CHAUDHARI 2207804");
        int [] num ={1,2,3,4,5};
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==3)
            {
                System.out.println("number 3 found at position"+i);
                break;
            }
            if(i==num.length-1)
            {
                System.out.println("Number 3 not found");
            }
        }
    }
}
