import java.util.Scanner;
import java.util.HashMap;


class Folder {
    int documents;         
    Folder[] subFolders;    

    Folder(int documents, Folder[] subFolders) {
        this.documents = documents;
        this.subFolders = subFolders;
    }
}

public class day7 {

    static void reveiw(int n){
        if(n == 0){
            return;
        }
        System.out.println("revewing day "+ n);
        reveiw(n-1);
    }
    static int countDocuments(Folder folder) {
        if (folder == null) {
            return 0;
        }

        int total = folder.documents;

        for (Folder sub : folder.subFolders) {
            total += countDocuments(sub);
        }

        return total;
    }

    public static void main(String[] args) {

        Folder f3 = new Folder(8, new Folder[]{});
        Folder f2 = new Folder(5, new Folder[]{});
        Folder f1 = new Folder(10, new Folder[]{f2, f3});

        System.out.println("Total Documents = " + countDocuments(f1));


//a fitness app records no of pushups completed each day day 1 has 10 pushups day 2 has 20 pushpus 3 has 30 pushups and so on the app needs to calculate the total pushups completed in n days input int days = 5 expected op total push ups is 50

    Scanner sc = new Scanner(System.in);
    int[] days = {10,20,30,40,50,60,70};
    System.out.println("Enter the day you wnat to know the push ups");
    int n = 5;

    System.out.println("the day on "+ n + "push ups are "+days[n-1]);

    //a bank is reviewing daily transactions the auditing system checks one days transaction and then automatically reveiwes the previous days this process continews until the first day is reached int days = 5 task display all days being reveiwed op re

    reveiw(5);


// a social media company wants to identify trending hashtags from a post the system receives a sequence of hashtags seperated by spaces to process large volumes of data one hashtag is analyze at a time and then the same operation is repeated on the remaining hashtags the frequency of each hashtag should be maintained for trend reporting input = string hashtags java ai java dsa ai java

    HashMap<String,Integer> frequency = new HashMap<>();
    String hashtags = "java ai java dsa ai java";
    String[] hashtag = hashtags.split(" ");

    for(String word: hashtag){
        if(frequency.containsKey(word)){
            frequency.put(word,frequency.get(word)+1);
        }
        else{
            frequency.put(word,1);
        }
    }
    System.out.println(frequency);

    sc.close();
    }
}
// a digital archive stores historical data in folders and subfolders each folder may contain additional folder creating a multilevel structure before migration to a new system administrators needs to count all documents present in the archives since the structure can contain folders within folders indifinitely the counting process must be performed recursively and determine the total no of documents input = folderA 3 docs , folderB 5 docs , folderC  6 docs 

