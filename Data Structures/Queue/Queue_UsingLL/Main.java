public class Main {
    public static void main(String[] args) {
        QueueLinkedList newQueue = new QueueLinkedList();
        newQueue.enQueue(10);
        newQueue.enQueue(20);
        newQueue.enQueue(30);
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.peek());
        newQueue.deleteQueue();
        System.out.println(newQueue.peek());
    }
}