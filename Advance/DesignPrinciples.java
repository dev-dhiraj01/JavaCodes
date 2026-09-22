//Design principles

class Solve{
        int sub1,sub2,sub3,sub4,sub5,sub6;

    Solve(int sub1,int sub2,int sub3,int sub4,int sub5,int sub6){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
        this.sub6 = sub6;
    }
    public double add(){
        double ans = (sub1+ sub2+ sub3+ sub4+ sub5+ sub6)/600.0*100;
        return ans;
    }
}

 public class DesignPrinciples {
public static void main(String[] args) {
    Solve s  = new Solve(85,95,63,42,75,85);
    Solve s2 = new Solve(86,77,63,52,75,95);
    Solve s3 = new Solve(55,75,83,62,45,55);
    Solve s4 = new Solve(55,75,83,62,45,55);
    Solve s5 = new Solve(55,75,83,62,45,55);
    Solve s6 = new Solve(55,75,83,62,45,55);

    double avg1 = s.add();
    double avg2 = s2.add();
    double avg3 = s3.add();
    double avg4 = s4.add();
    double avg5 = s5.add();
    double avg6 = s6.add();

    if(avg1 >= avg2 && avg1 >=avg2 && avg1>= avg3 && avg1 >= avg4 &&avg1 >=avg5 &&avg1 >= avg6){
        System.out.println("Student 1 scored the most marks "+avg1);
    }

    if (avg2 >= avg2 && avg2 >= avg2 && avg2 >= avg3 && avg2 >= avg4 && avg2 >= avg5 && avg2 >= avg6) {
        System.out.println("Student 2 scored the most marks " + avg2);
    }
    if (avg3 >= avg2 && avg3 >= avg2 && avg3 >= avg3 && avg3 >= avg4 && avg3 >= avg5 && avg3 >= avg6) {
        System.out.println("Student 3 scored the most marks " + avg3);
    }
    if (avg4 >= avg2 && avg4 >= avg2 && avg4 >= avg3 && avg4 >= avg4 && avg4 >= avg5 && avg4 >= avg6) {
        System.out.println("Student 4 scored the most marks " + avg4);
    }
    if (avg5 >= avg2 && avg5 >= avg2 && avg5 >= avg3 && avg5 >= avg4 && avg5 >= avg5 && avg5 >= avg6) {
        System.out.println("Student 5 scored the most marks " + avg5);
    }
    if (avg6 >= avg2 && avg6 >= avg2 && avg6 >= avg3 && avg6 >= avg4 && avg6 >= avg5 && avg6 >= avg6) {
        System.out.println("Student 6 scored the most marks " + avg6);
    }
    
}
}
