class Student{
	int rn;
	String nm;
	int marks;
}
class ArrObj{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.rn = 1;
		s1.nm = "Dhiraj";
		s1.marks = 89;

		Student s2 = new Student();
		s2.rn = 2;
		s2.nm = "Aman";
		s2.marks = 79;

		Student s3 = new Student();
		s3.rn = 3;
		s3.nm = "Pratik";
		s3.marks = 82;		
		
		Student st[] = new Student[3];
		
		st[0] = s1;
		st[1] = s2;
		st[2] = s3;

		for(int i = 0; i < st.length; i++){
		System.out.println("Name :" + st[i].nm + " roll No : " + st[i].rn + " marks : " + st[i].marks);
		}
	}
}