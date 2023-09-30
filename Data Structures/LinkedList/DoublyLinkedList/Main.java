public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
//        for(int i =1; i<5; i++){
//            dll.insertDLL(5+i, i);
//        }
        dll.insertDLL(2,1);
        dll.insertDLL(3,2);
        dll.insertDLL(4,3);
        dll.insertDLL(5,4);
        System.out.println(dll.size);
        dll.forwardTraverse();
        dll.reverseTraverse();
        dll.searchNode(5);
        dll.deleteDLL();
        dll.forwardTraverse();
    }
}