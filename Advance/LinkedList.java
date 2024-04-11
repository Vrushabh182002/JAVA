package Advance;
//Inserting from the head node.
class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
};
class LL{
    Node head;
    Node tail;
    int size;
    LL(){
        this.size=0;
    }    

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if (tail == null)  {
            tail = head;
        }    
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
};
public class LinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.display();
    }
}
