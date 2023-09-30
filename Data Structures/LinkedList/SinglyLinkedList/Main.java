public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(6,2);
        sLL.insertInLinkedList(8,3);
        sLL.insertInLinkedList(6,4);
        sLL.insertInLinkedList(10,5);
        sLL.insertInLinkedList(11,6);
        sLL.traversalSinglyLinkedList();
        sLL.searchNode(6);
    }
}
