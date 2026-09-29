public class SBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println("capacity="+sb.capacity());
        StringBuffer sb1=new StringBuffer("ABC");
        System.out.println(sb1);
        StringBuffer sb2=new StringBuffer(3);
        System.out.println("capacity="+sb.capacity());
        StringBuffer sb3=new StringBuffer(sb2);
        sb1.reverse();
        System.out.println("reverse string"+sb1);
        sb1.append("d");
        System.out.println("append fumction"+sb1);
       sb1.insert(1,'$');
        System.out.println("inserted element"+sb1);
        sb1.delete(1,3);
        System.out.println("deleted string"+sb1);

    }
}
