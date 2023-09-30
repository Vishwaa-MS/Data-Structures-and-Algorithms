public class CircularDoublyLinkedList {
    public int size;
    public CircularDoublyNode head;
    public CircularDoublyNode tail;

    public void createCDLL(int value){
        //head= new CircularDoublyNode();
        CircularDoublyNode newNode = new CircularDoublyNode();
        newNode.value = value;
        newNode.next = newNode;
        newNode.prev = newNode;
        head = newNode;
        tail = newNode;
        size++;
    }

    public void insertCDLL(int value, int location){
        CircularDoublyNode newNode = new CircularDoublyNode();
        newNode.value =value;
        if(head==null){
            createCDLL(value);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            newNode.next.prev = newNode; // head.prev = newNode;
            head =newNode;
            tail.next = newNode;
        } else if (location >= size){
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else{
            CircularDoublyNode tempNode = new CircularDoublyNode();
            int index = 0;
            while (index<location-1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev =newNode;
        }
        size++;
    }
    public void forwardTraverse(){
        if(head != null){
            CircularDoublyNode tempNode = head;
            for(int i=0; i < size; i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The DoublyLinkedList does not exist.");
        }
        System.out.println("\n");
    }
    public void reverseTraverse(){
        if(head !=null){
            CircularDoublyNode tempNode = tail;
            for(int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        }
        else {
            System.out.println("The DoublyLinkedList does not exist.");
        }
        System.out.println("\n");
    }

    public boolean searchNode(int nodeValue){
        if(head != null){
            CircularDoublyNode tempNode = head;
            for(int i=0; i<size; i++)  {
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

    public void deleteNode(int location){
        if(head==null){
            System.out.println("The CircularDoublyLinkedList does not exist. ");
        } else if (location == 0) {
            if(size==1){
                head.prev = null;
                head.next = null;
                head = null;
                tail = null;
                size--;
                return;
            } else{
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            CircularDoublyNode tempNode = tail.prev;
            if(size==1){
                head.prev = null;
                head.next = null;
                head = null;
                tail = null;
                size--;
                return;
            } else{
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else {
            CircularDoublyNode tempNode = head;
            for(int i = 0; i < location -1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    public void deleteCDLL() {
        CircularDoublyNode tempNode = head;
        for (int i=0; i<size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The CircularDoublyLinkedList has been deleted!");
    }
}
