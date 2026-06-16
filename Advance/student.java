package Advance;

import java.util.Scanner;

public class student {
    public String name;
    public int age;
    public String Cname;
    private int pocketMoney;

     student(int pocketMoney) {
        this.pocketMoney = pocketMoney;
    }
    void setdata(String name, int age, String Cname) {
        this.name = name;
        this.age = age;
        this.Cname = Cname;
    }
    void getdata(){
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("College name : "+Cname);
        System.out.println("Pocket Money : "+pocketMoney);
    }
    public static void main(String[] args) {
        student st = new student(1000);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of student : ");
        st.name = sc.nextLine();
        System.out.println("Enter the age of student : ");
        st.age = sc.nextInt();
        System.out.println("Enter the college name of student : ");
        st.Cname = sc.next();
        st.getdata();
        sc.close();
    }
}
