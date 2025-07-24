public class LinkedList {
   Node head;
 class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            next = null;
        }
    }
      public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        //linkedlist is empty
        if(head==null){
            // head = new Node(newData);
            head = newNode;
            return;
        }
        // when linkked list is not empty
        // newNode.next = null;
        Node temp = head;
        while(temp.next!=null ){
            temp= temp.next;
      }
      temp.next=newNode;
      return;
    }

    public void insertAtBeginning(int newData){
     
        Node newNode = new Node(newData);
        newNode.next=head;
        head=newNode;
 }
 
    
 public void insertAnyPosition(Node prev_node, int newdata){
     if(prev_node==null){
        System.out.println(" The previous node can't contain null values");
        return;
     }
     Node newNode = new Node(newdata);
      newNode.next=  prev_node.next;
     prev_node.next= newNode; 

 }


  public void deleteNode(int position){
     Node temp = head;
     // if linked list is empty
     if(head == null){
        System.out.println("linked list is empty");
        return;
     }
    // if deletion is in the beginning of the node
    if(position ==0){
        head=temp.next;
        return;
    }
    // if deletion is any postion of the node
    for(int i=0;temp!=null && i<position-1;i++){
        temp= temp.next;
    }
    if(temp==null && temp.next==null){
        return;
    }
    temp.next = temp.next.next;


  }

    public void displayLL(){
        Node current =head;
        while(current!=null){
            System.out.print(current.data+" ");
            current= current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
         list.insertAtEnd(2);
         list.insertAtEnd(4);
         list.insertAtEnd(6);
         System.out.println("Before insertion of new element");
         list.displayLL();
         System.out.println();
         list.insertAtEnd(10);
         System.out.println("after insertion of new element");
         list.insertAtBeginning(1);
         list.insertAnyPosition(list.head.next.next, 17);
         list.displayLL();
         System.out.println();
         System.out.println("deletion in a linked list");

        list.deleteNode(3);
        list.displayLL();
    }
}
