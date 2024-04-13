class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
    }
    Node(int val,Node next){
        this.data=val;
        this.next=next;
    }
};
class LL{
    Node head;
    Node tail;
    int size;
    LL(){
        this.size=0;
    }
    void insertF(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    void deleteF(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }
    void insertE(int val){
        if(tail==null){
            insertF(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    void deleteE(){
        if(size<=1){
            deleteF();
            return;
        }
        Node last = get(size-2);
        tail=last;
        tail.next=null;
        size--;
    }
    Node get(int pos){
        Node temp = head;
        for(int i=0;i<pos;i++){
            temp=temp.next;
        }
        return temp;
    }
    void insertM(int val,int pos){
        if(pos==0){
            insertF(val);
            return;
        }
        if(pos==size-1){
            insertE(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    void deleteM(int pos){
        if(pos<=1){
            deleteF();
            return;
        }
        if(pos==size-1){
            deleteE();
            return;
        }
        Node prev = get(pos-1);
        prev.next=prev.next.next;
        size--;
    }
    Node findNode(int pos){
        Node temp=head;
        while(temp!=null){
            if(temp.data==pos){
                System.out.println("Found "+pos);
            }
            temp=temp.next;
        }
        return null;
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
public class FindNodeLL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertF(3);
        list.insertF(2);
        list.insertF(1);
        list.insertF(1);
        list.insertE(5);
        list.insertM(4, 4);
        list.display();
        list.deleteF();
        list.display();
        list.deleteE();
        list.display();
        list.deleteM(3);
        list.display();
        list.findNode(5); 
        list.display();
    }
}