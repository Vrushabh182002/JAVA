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
    int size;
    Node head;
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
        node.prev=last;
        node.next=null;
        size++;
    }
    Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    void insertM(int after,int val){
        Node pos = find(after);
        if(pos==null){
            System.out.println("Does not exist! ");
            return;
        }
        Node node = new Node(val);
        node.next = pos.next;
        node.prev = pos;
        pos.next=node;
        if(node.next != null) {
            node.next.prev=node;
        }
    }
    void display(){
        Node temp = head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.data+"->");
            last=temp;
            temp=temp.next;
        }
        System.out.println("End\n");
        while(last!=null){
            System.out.print(last.data+"<-");
            last=last.prev;
        }
        System.out.println("Start\n");
    }
};
public class DoubleLLIM {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertF(3);
        list.insertF(2);
        list.insertF(1);
        list.insertF(0);
        list.insertE(99);
        list.display();
        list.insertM(3,4);
        list.display();
    }
}