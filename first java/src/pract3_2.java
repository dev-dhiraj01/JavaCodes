//wrapper class
public class pract3_2 {
    public static void main(String[] args) {
        Integer i=new Integer(10);
        Double d=new Double(3.14);
        Boolean b=new Boolean(false);

        int intValue= i.intValue();
        double doubleValue=d.byteValue();
        boolean booleanValue=b.booleanValue();
        System.out.println("integer value "+intValue);
        System.out.println("double value "+doubleValue);
        System.out.println("boolean value "+booleanValue);

        Integer strToInt=Integer.valueOf("100");
        Double strToDouble=Double.valueOf("3.14");
        Boolean strToBoolean=Boolean.valueOf("True");

        System.out.println("String to Integer "+strToInt);
        System.out.println("String to Double "+strToDouble);
        System.out.println("String to Boolean "+strToBoolean);
    }
}
