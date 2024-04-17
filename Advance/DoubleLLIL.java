class Node{
    int data;
    Node next;
    Node prev;
    Node(int val){
        this.data=val;
    }
    Node(int val,Node next,Node prev){
        this.data=val;
        this.next=next;
        this.prev=prev;
    }
};
class DLL{
    Node head;
    int size;
    DLL(){
        this.size=0;
    }
    void insertF(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        size++;
    }
    void insertE(int val){
        Node node = new Node(val);
        Node last = head;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.next=null;
        node.prev=last;
        size++;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
};
public class DoubleLLIL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertF(3);
        list.insertF(2);
        list.insertF(1);
        list.insertF(0);
        list.display();
        list.insertE(99);
        list.display();
    }
}
