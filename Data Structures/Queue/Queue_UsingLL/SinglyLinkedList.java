public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Creating a SinglyLinkedList
    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    //Inserting Method in SinglyLinkedList
    public void insertInLinkedList(int value, int location){
        Node node = new Node();
        node.value=value;
        if (head==null){
            createSinglyLinkedList(value);
            return;
        } else if(location==0){
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;// setting the current tail's next reference to the new node.
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next; // here the current's node's next node will be the nextNode.
                                          // So we are saving the address of the nextNode's address
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
    //traversing through SinglyLinkedList.
     public void traversalSinglyLinkedList() {
        if (head == null ){
            System.out.println("Singly LinkedList Does not Exists");
        } else {
            Node tempNode = head;
            for (int i =0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }
    //Searching in Singly Linked List
    public boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i=0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.print("Found the node at location: " +i+ "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node not found");
        return false;
    }
    //Deletion in SinglyLinkedList
    public void deletionOfNode(int location){
        if(head == null){
            System.out.print("The SinglyLInkedList Does not exist. ");
        } else if (location==0) {
            head = head.next;
            size--;
            if(size==0){
               tail=null;
           }
        } else if (location>=size) {
            Node tempNode = head;
            for(int i=0; i < size-1; i++){
                tempNode = tempNode.next;
            }
         if(tempNode == head){
             head = tail = null;
             size--;
             return;
         }
         tempNode.next = null;
         tail =tempNode;
         size--;
        } else {
            Node tempNode = head;
            for (int i =0; i < location -1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next; // here we are getting the address of nextNode which is after the deleting node.
            size--;
        }
    }
    public void deletionOfEntireSinglyLinkedList(){
        head = null;
        tail=null;
        size=0;
        System.out.println("Successfully deleted the SinglyLikedList");
    }
}
