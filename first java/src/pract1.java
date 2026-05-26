public class pract1 {
    public static void main(String[] args) {
        System.out.println("NAME:-DHIRAJ CHAUDHARI 2207804");
        int sum =0;
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            sum=sum+i;
        }
        System.out.println("the sum is ="+sum);
    }
}
