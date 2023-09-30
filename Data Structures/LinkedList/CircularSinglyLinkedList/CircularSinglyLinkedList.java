public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularSinglyLinkedList(int value){
        head = new Node();
        Node node  = new Node();
        node.value = value;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertNode(int value, int location){
        Node node = new Node();
        node.value = value;
        if(head == null){
            createCircularSinglyLinkedList(value);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >=size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = new Node();
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    public void traverseCSLL(){
        if (head == null) {
            System.out.println("CircularSinglyLinkedList does not exist.");
        } else {
            Node tempNode =head;
            for(int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }
    }

    public boolean search(int value){
        if(head!=null){
            Node tempNode = head;
            for(int i = 0; i < size; i++){
                if(tempNode.value == value){
                    System.out.println("Found the value at node: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    public void deletionNode(int location){
        if(head==null){
            System.out.println("The CircularLinkedList does not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if(size==0){
                tail =null;
                head =null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for(int i=0; i<size-1; i++){
                tempNode = tempNode.next;
            } if(tempNode == head){
                head.next = null;
                tail = head = null;
                size--;
                return;
            } tempNode.next = head;
            tail = tempNode;
            size--;
        } else{
            Node tempNode = head;
            for(int i = 0; i < location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    public void deleteFullCSLL(){
        if(head == null){
            System.out.println("The CSLL does not exist");
        } else{
        Node tempNode = head;
        tail.next = null;
        head = null;
        tail = null;
        System.out.println("Successfully deleted CSLL");
        }
    }

}
