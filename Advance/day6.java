import java.util.Scanner;

//standing betn two mirrors Imagine you are standing in a dressing room with a mirror directly in front of you and another directly behind you the .process the front mirror reflects the back mirror which reflects the front mirror creating an image inside an image inside an image the reflection repeates until the image becoms too tiny 
//the identifier the input string or property passed into the system 
//the payload the data object reference occupying that specific memory 
// the mechanism instead of a scequential linear search which results an o(n) time complexity the sys applies a deterministic mechanism to resolve the exact index instently by bypassing iterative traversal the data payload is retrive in o(1) constant time 

class day6{

static void access(String id, int s, int e) {
    if (s >= e) {
        System.out.println("Access Granted...");
        return;
    }

    if (id.charAt(s) != id.charAt(e)) {
        System.out.println("Access Denied...");
        return;
    }

    access(id, s + 1, e - 1);
}

    static int quantumjumps(int level){
        int totaljumps = 0;

        if(level == 1){
            return 1;
        }
        totaljumps = (level + quantumjumps(level-1));

        return totaljumps;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = "madam";
        int n = name.length()-1;
        access(name,0,n);

        System.out.println("Enter the no of levels ");
        int level = sc.nextInt();
        int total = quantumjumps(level);
        System.out.println("the total no of jumps are : " + total);

        sc.close();
    }
}