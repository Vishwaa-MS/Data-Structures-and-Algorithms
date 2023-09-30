public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();
        cSLL.createCircularSinglyLinkedList(5);
        cSLL.insertNode(4,1);
        cSLL.insertNode(3,2);
        cSLL.insertNode(2,3);
        cSLL.insertNode(1,4);
        cSLL.traverseCSLL();
    }
}