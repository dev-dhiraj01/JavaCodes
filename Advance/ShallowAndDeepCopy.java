    class Address {
        String city;

        Address(String city) {
            this.city = city;
        }
    }

    class Student {
        String name;
        Address address;

        Student(String name, Address address) {
            this.name = name;
            this.address = address;
            // this.address = new Address(address.city);
        }
    }

  public class ShallowAndDeepCopy {
        public static void main(String[] args) {
            Address a = new Address("Nagpur");

            Student s1 = new Student("Dhiraj", a);

            // Shallow copy copies only Adderess of one Object into Another
            Student s2 = new Student(s1.name, s1.address);

            System.out.println(s1.address.city);
            System.out.println(s2.address.city);

            s2.address.city = "Pune";

            System.out.println(s1.address.city);
            System.out.println(s2.address.city);


            // Deep copy  Creates new Object with same data
            Address b = new Address("Nagpur");
            Student d1 = new Student("Dhiraj", b);

            Student d2 = new Student(d1.name,new Address(d1.address.city));

            d2.address.city = "Pune";

            System.out.println(d1.address.city);
            System.out.println(d2.address.city);
        }
    }

