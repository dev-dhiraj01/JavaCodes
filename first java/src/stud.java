class college{
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

public class stud extends college{
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








