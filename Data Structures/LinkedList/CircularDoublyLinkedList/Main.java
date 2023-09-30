public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cDLL = new CircularDoublyLinkedList();
        cDLL.createCDLL(1);
        //System.out.println(cDLL.head.value);
        cDLL.insertCDLL(3,1);
        cDLL.insertCDLL(5,2);
        cDLL.insertCDLL(7,3);
        cDLL.insertCDLL(9,4);
        cDLL.forwardTraverse();
        cDLL.reverseTraverse();
        cDLL.searchNode(5);
        cDLL.deleteNode(3);
        cDLL.forwardTraverse();
        cDLL.deleteCDLL();
        cDLL.forwardTraverse();
        System.out.println(cDLL.size);
    }
}