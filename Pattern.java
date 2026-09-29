import java.util.Scanner;

class Pattern{
	public static void main(String args[]){
		int length;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the pattern");
		length = s.nextInt();
		for(int i = 0; i < length; i++){
			for(int j = 0; j <= i; j++){
				System.out.print("* ");
			}
		System.out.println("");
		}
	}
}