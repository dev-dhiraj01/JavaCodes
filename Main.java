class Calculator{

public int add(int n1, int n2 ){
	
	int r = n1 + n2;
	System.out.println("In add ");
	return r;
}

}

public class Main{

	public static void main(String args[]){
		int num1 = 5;
		int num2 = 5;

		Calculator cl = new Calculator();

		int result = cl.add(num1,num2);

		System.out.println(" result : " + result );

	}
}





