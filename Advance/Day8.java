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


        
//a satalite transmits data packates in decimal form the ground station must convert the packate id into binary, double the packate value using bit shifting , verify a permission mask using the and operator ip = packate id  = 13 mask = 26   bin value  double value = 

        int packetId = 13;
        int mask = 26;

        
        String binary = Integer.toBinaryString(packetId);

        
        int doubledValue = packetId << 1;

        
        int andResult = packetId & mask;

        System.out.println("Packet ID        : " + packetId);
        System.out.println("Binary Value     : " + binary);
        System.out.println("Doubled Value    : " + doubledValue);
        System.out.println("Mask             : " + mask);
        System.out.println("AND Result       : " + andResult);

        if (andResult != 0) {
            System.out.println("Permission Granted");
        } else {
            System.out.println("Permission Denied");
        }


        //ironman has designed a new armar with multiple security features before activating features jarvis checks whether both the use and the armer posses prerequired permissions input = userPermission = 13 and armerPermission = 11 task find the permission that are active in both

        System.out.println(13 & 11);

        // the flash comperss a time line by repeatedly reducing time intervals the starlabs teams uses bit shifting instead of division ip = timeline = 128 compression = 3; task find the compress time line op

    int time = 128;
        for(int i = 0; i < 3;i++){
            time = time>>1;
        }
        System.out.println(time);


        //following the event of endgame dr strange and ironman develop a multiverse security system to monitor access to diff realities each infinity stone grants a unique permissions represented as binary flag during a rutine sec audit the sys must verify whether the specific permissions are active and combine newly acquire permissions and identify the conflicting permissions and temp decible and calculate the total no of active permissions to improve performance all operations should be bit manipulation ip powerstone = 000001 spacestone 000010 realitystone 000100 soulstone 001000 timestone 010000  mindstone 100000 currunt status int permissions = 45  convert the permission value to binary check whether the timestone permission is active add the spacestone to the permission remove the solestone permission find the diff between the original and updated permissions double the permission value using bit shifting divide the permission value by 4 using bit shifting count the total no of active permission op = binvalue = 10001 timestone = active after adding space stone = 101111 afterremoving soul stone = 100111 change permission = 001010 double value = 90 quarter value = 11 active value = 4 

        
        int POWER = 1;      
        int SPACE = 2;      
        int REALITY = 4;    
        int SOUL = 8;       
        int TIME = 16;      
        int MIND = 32;      

        // Current Permissions
        int permissions = 45;

        // 1. Convert to Binary
        System.out.println("Binary Value            : " + Integer.toBinaryString(permissions));

        // 2. Check Time Stone Permission
        if ((permissions & TIME) != 0) {
            System.out.println("Time Stone              : Active");
        } else {
            System.out.println("Time Stone              : Not Active");
        }

        // 3. Add Space Stone Permission
        int updatedPermissions = permissions | SPACE;
        System.out.println("After Adding Space      : " + Integer.toBinaryString(updatedPermissions));

        // 4. Remove Soul Stone Permission
        updatedPermissions = updatedPermissions & (~SOUL);
        System.out.println("After Removing Soul     : " + Integer.toBinaryString(updatedPermissions));

        // 5. Find Changed Permissions
        int changedPermissions = permissions ^ updatedPermissions;
        System.out.println("Changed Permissions     : " + Integer.toBinaryString(changedPermissions));

        // 6. Double Permission Value
        int doubleValue = permissions << 1;
        System.out.println("Double Value            : " + doubleValue);

        // 7. Divide by 4
        int quarterValue = permissions >> 2;
        System.out.println("Quarter Value           : " + quarterValue);

        // 8. Count Active Permissions
        int activePermissions = Integer.bitCount(permissions);
        System.out.println("Active Permissions      : " + activePermissions);
    }
}
