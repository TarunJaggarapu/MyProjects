class CodeLL{
public static void main(String[] args) {
   LinkedList list = new LinkedList();
   list.insert(5); 
   list.insert(10); 
   list.insert(15); 
   list.insert(20); 
   list.insert(25); 
   list.insertAtStart(1);
   list.show();
}
}
class Node{
    int data;
    Node next;
}
class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(index == 0){
            insertAtStart(data);
        }
        else {
            Node n = head;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            Node n1;
            for(int i=0; i<index-1; i++){
                n= n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }
    public void reverse(){
        Node prev, current, nextNode;
        prev = null;
        current = head;
        nextNode = head;
        while (nextNode!=null){
            nextNode = nextNode.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
        }
    public void show(){
        Node n = head;
       // int count = 0;
        while(n!= null){
         //   count+=1;
            System.out.println(n.data);
            n=n.next;
        }
        //  System.out.println(count); // TO PRINT LENGTH OF LIST
    }
}