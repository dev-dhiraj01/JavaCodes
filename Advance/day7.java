
class Folder {
    int documents;         
    Folder[] subFolders;    

    Folder(int documents, Folder[] subFolders) {
        this.documents = documents;
        this.subFolders = subFolders;
    }
}

public class day7 {

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
    }
}
// a digital archive stores historical data in folders and subfolders each folder may contain additional folder creating a multilevel structure before migration to a new system administrators needs to count all documents present in the archives since the structure can contain folders within folders indifinitely the counting process must be performed recursively and determine the total no of documents input = folderA 3 docs , folderB 5 docs , folderC  6 docs 