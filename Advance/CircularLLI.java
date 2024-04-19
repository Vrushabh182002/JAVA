class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
    }
};
class CLL{
    int size;
    Node head;
    Node tail;
    CLL(){
        this.size=0;
        this.head=null;
        this.tail=null;
    }
    void insert(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size++;
    }
    void display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.data+"->");
                temp=temp.next;
            }while(temp!=head);
        }
        System.out.println("Head");
    }
}
public class CircularLLI {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.insert(0);
        list.insert(99);
        list.display();
    }
}
