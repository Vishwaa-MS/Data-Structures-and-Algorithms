public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDLL(int nodeValue) {
        //head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return  head;
    }

    public void insertDLL(int value, int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = value;
        if(head==null){
            createDLL(value);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    public void forwardTraverse(){
        if(head != null){
            DoublyNode tempNode = head;
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
            DoublyNode tempNode = tail;
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
            DoublyNode tempNode = head;
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

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The DLL does not exist!");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (location >= size) {
            DoublyNode tempNode = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    public void deleteDLL(){
        DoublyNode tempNode = head;
        for (int i=0; i<size; i++){
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("Successfully deleted the DoublyLinkedList.");
    }
}
