interface Computer{
	 void code();
}
class Desktop implements Computer{
	public void code(){
		System.out.println("code,compile,run, Faster....");
	}
}
class Laptop implements Computer{
	public void code(){
		System.out.println("code,compile,run....");
	}
}
class Developer{
	public void devApp(Computer lap){
		lap.code();		
	}
}
class Google{
	public static void main(String args[]){
		Developer Dhiraj = new Developer();
		Computer lap = new Laptop();
		Computer desk = new Desktop();
		
		Dhiraj.devApp(desk);
		Dhiraj.devApp(lap);
	}
}