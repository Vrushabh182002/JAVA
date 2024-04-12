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
    int size;
    Node head;
    Node tail;
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
    void insertM(int val,int pos){
        if(pos==0){
            insertF(val);
            return;
        }
        if(pos==size){
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
    void deleteF(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }
    void deleteE(){
        if(size<=1){
            deleteF();
            return;
        }
        Node secondlast=get(size-2);
        tail=secondlast;
        tail.next=null;
        size--;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
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
public class LinkedListDE {
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
    }
}
