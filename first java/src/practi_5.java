//inheritance
class college1{
    String cname;
    int cid;
    void cgd(String s,int i)
    {
        cname=s;
        cid=i;
    }
    void csd()
    {
        System.out.println(cname+" "+cid);
    }
}

public class practi_5 extends college1{
    String sn;
    int rno;
    void sgd(String n,int r)
    {
        sn=n;
        rno=r;
    }
    void ssd()
    {
        System.out.println(sn+" "+rno);
    }

    public static void main(String[] args) {
        System.out.println("name: DHIRAJ V CHAUDHARI RNO:2207804");
        stud s=new stud();
        s.cgd("Gpn",123);
        s.sgd("Dhiraj",2207804);
        s.csd();
        s.ssd();
    }
}








