class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        next = null;
    }
};
class LL{
    Node head;
    Node tail;
    int size=0;
    LL(){
        this.size=0;
    }
    void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if (tail == null)  {
            tail = head;
        }    
        size++;
    }
    void insertEnd(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail=node;
        size++;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
};
public class LinkedListIE {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(4);
        list.insertEnd(5);
        list.insertEnd(6);
        list.insertEnd(7);
        list.insertEnd(9);
        list.display();
    }
}
