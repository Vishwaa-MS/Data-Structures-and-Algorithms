public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLL(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size++;
    }

    public void insertNode(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traverseLL(){
        Node tempNode = head;
        for(int i =0; i < size; i++){
            System.out.print(tempNode.value);
            if(i != size-1){
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }
}
