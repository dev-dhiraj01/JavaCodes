import java.util.Scanner;

class Account {
    float balance;
    String name;
    String dob;
    Scanner s;

    public Account(Scanner scanner) {
        this.s = scanner;
        balance = 0;
        name = "";
        dob = "";
    }

    public void createAccount() {
        System.out.println("Please Enter the Name Balance and Date of birth");

        name = s.nextLine();
        balance = s.nextFloat();
        s.nextLine();
        dob = s.nextLine();

        System.out.println("\nThe Account is Created Successfully ");

        show();
    }

    public void show() {
        System.out.println(" Your Details are.....!");
        System.out.println("Name : " + name + " DOB : " + dob + " Balance : " + balance);
    }
}

class Deposit extends Account {
    public Deposit(Scanner scanner) {
        super(scanner);
    }

    public void Depo() {
        System.out.println("Enter the Ammount to Deposit.......");

        float depositAmmount = s.nextFloat();

        balance += depositAmmount;

        System.out.println("\nThe Ammount is Deposited. \n The Total Balance is : " + balance);


    }
}

class Withdrow extends Deposit {

    public Withdrow(Scanner scanner) {
        super(scanner);
    }

    public void Withd() {
        System.out.println("\nEnter the Ammount to Withdrow.......");

        float withdrowAmmount = s.nextFloat();
        if (balance > withdrowAmmount) {
            balance -= withdrowAmmount;

            System.out.println("The Ammount is Withdrowed. \n The Total Balance is : " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }

    }
}

public class Customer extends Withdrow {
    public Customer(Scanner scanner) {
        super(scanner);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer obj = new Customer(scanner);

        while (true) {
            System.out.println("\n*********************************");
            System.out.println("\tEnter the choice ");
            System.out.println("\t1. Create Account");
            System.out.println("\t2. Withdrow Ammount");
            System.out.println("\t3. Deposit Ammount");
            System.out.println("\t4. Exit ");
            System.out.println("*********************************\n");

            int ch = scanner.nextInt();
            scanner.nextLine();

            switch (ch) {
                case 1:
                    obj.createAccount();
                    break;
                case 2:
                    obj.Withd();
                    break;
                case 3:
                    obj.Depo();
                    break;
                case 4:
                    System.out.println("Thank You...!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Input...!");
                    break;
            }

        }
    }
}
