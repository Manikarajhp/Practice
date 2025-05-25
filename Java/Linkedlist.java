
class Node{
    int data;
    Node next;
}

class Operation {
    Node head;
    //INSERT THE NODE AT LAST
    public void Insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    // INSERT THE ELEMENT AS HEAD NODE
    public void InsertFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;        
    }
    // INSERT THE NODE AT SPECTFIC INDEX 
    public void InsertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
        for(int i = 0; i < index-1; i++){
            n = n.next;
        }

        node.next = n.next;
        n.next = node;
    }
    // DELETE NODE AT LAST 
    public void Delete(){
        Node n = head;
        while (n.next.next != null) {
            n = n.next;
        }
        n.next = null;
    }
    // DELETE NODE AT HEAD 
    public void DeleteHead(){
        if(head == null){
            System.out.println("No head value.");
        }
        else{
            head = head.next;
        }
    }
    // DELETE NODE AT INDEX POSITION 
    public void DeleteAt(int index){
        Node n = head;
        for(int i = 0; i < index-1; i++){
            n = n.next;
        }
        n.next = n.next.next;
    }
    // SEARCH ELEMENT AT INDEX
    public void Search(int target){
        Node n = head;
        int index = 0;
        while(n.next != null){
            if(n.data == target){
                System.out.println(index);
                return ;
            }
            index++;
            n = n.next;
        }
        System.out.println("Element not found.");
    }
    // DISPLAY THE ELEMENTS OF LINKEDLIST 
    public void display(){
        Node n = head;
        while(n.next != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }
    
}

public class Linkedlist {
    public static void main(String[] args) {
        Operation list = new Operation();
        list.Insert(0);
        list.Insert(2);
        list.Insert(3);
        list.Insert(39);
        System.out.print("The list after inserting 6 elements : ");
        list.display();

        list.InsertFirst(12);
        System.out.print("The list after inserting  head element : ");
        list.display();

        list.InsertAt(1, 10);
        System.out.print("The list after inserting 10 at index 1 : ");
        list.display();

        list.Delete();
        System.out.print("The list after deleting last element : ");
        list.display();

        list.DeleteHead();
        System.out.print("The list after deleting head element : ");
        list.display();

        list.DeleteAt(2);
        System.out.print("The list after deleting by index : ");
        list.display();

        System.out.print("The element 10 in :");
        list.Search(10);


    }
}