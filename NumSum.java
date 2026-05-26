import java.util.Scanner;

class NumSum{
	public static void main(String args[]){
	
	int num;
	int length;
	int result = 0;

	Scanner s = new Scanner(System.in);

	System.out.println("Enter A number to calculate the sum : ");
	num = s.nextInt();

	System.out.println("Enter the length of the number :");
	length = s.nextInt();
	for(int i = 0; i < length; i++){
		int last = num % 10;
		num = num / 10;
		result = result + last;
	}
	
	System.out.println(" Result : " + result );

	}
}