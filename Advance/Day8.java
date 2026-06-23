class Day8{

    public static void main(String arge[]){

        int cap = 5;
        for(int i = 0; i < 2;i++){
            cap = cap<<1;
        }
     
        System.out.println(cap);


//and onlie platform discount flags to customers premium customer = 0100 festival cust = 0010 bank offer 0001 a customer has all 3 offers enabled ip premium = 4 festivle = 2 bank = 1 combile all availabe offers using all suitable operations

        int PREMIUM = 4;   // 0100
        int FESTIVAL = 2;  // 0010
        int BANK = 1;      // 0001

        // Combine all offers
        int offers = PREMIUM | FESTIVAL | BANK;

        System.out.println("Offers Value: " + offers); // 7

        // Check Premium Offer
        if ((offers & PREMIUM) != 0) {
            System.out.println("Premium Offer Available");
        }

        // Check Festival Offer
        if ((offers & FESTIVAL) != 0) {
            System.out.println("Festival Offer Available");
        }

        // Check Bank Offer
        if ((offers & BANK) != 0) {
            System.out.println("Bank Offer Available");
        }

        // Remove Festival Offer
        offers = offers & (~FESTIVAL);
        System.out.println("\nAfter Removing Festival: " + offers);

        // Add Festival Offer Again
        offers = offers | FESTIVAL;
        System.out.println("After Adding Festival: " + offers);

        // Toggle Bank Offer
        offers = offers ^ BANK;
        System.out.println("After Toggling Bank: " + offers);

        // Check Bank Offer Again
        if ((offers & BANK) != 0) {
            System.out.println("Bank Offer Available");
        } else {
            System.out.println("Bank Offer Not Available");
        }



    
    }
}
