import java.util.Scanner;

class Input{
	public static void main(String args[]){
		int num1;
		int num2;
		
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the first number");
			num1 = s.nextInt();
			
			System.out.println("Enter the second number");
			num2 = s.nextInt();
			
			System.out.println("the addition of given numbers is : "+(num1+num2));
			
			s.close();
	}
}
