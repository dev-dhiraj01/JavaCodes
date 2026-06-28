/*

can a array have duplicate elements

can an array store diff datatypes

is an array size fixed after creation 

can you access arr[arr.length];
 
are arrays objects in java;

you recieve one new ele at a time and the existing array is already sorted quick sorting algo is a best choice 

a company once occurently O(log n) they using extra memory which algo they should use

can mearg sort work on already sorted array.

an ecommerece company receives customer Id throughout the day due to multiple servers the ids are not stored in sorted order before generating the final report the system has to store it in a sorted way  105,102,109,101,108,103

linked list is a linear data structure where elements(nodes) are not stored in contiguous memory each node contains data and next the reference 

Difference (array and linked list)

    features                 array                   linked list

    memory                  contigious                non contigious 

    size                    fixed                      Dynamic 

    access                  fast                        slow

    insertion deletion      slow                        fast

    memory usage            less                        more

    random access           possible                    not possible


When to use an array
    frequent random access by index
    size known in advance
    fast searching and sorting 

when to use a linked list 
    when size changing dynamically
    frequent insertion and deletion 
    no need for random access by index

Application of linked list
    stack implementation
    dynamic memory allocation graph representation
    
*/
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
class Day11{

    public static void main(String args[]){
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}