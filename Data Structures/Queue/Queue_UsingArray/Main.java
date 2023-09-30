public class Main {
    public static void main(String[] args) {

        QueueArray newQueue = new QueueArray(5);
        System.out.println(newQueue.isEmpty());
        System.out.println(newQueue.isFull());
        newQueue.enQueue(5);
        newQueue.enQueue(50);
        newQueue.deQueue();

        CircularQueue newCQ = new CircularQueue(5);
        newCQ.enQueue(10);
        newCQ.enQueue(20);
        newCQ.enQueue(30);
        newCQ.enQueue(40);
        newCQ.enQueue(50);
        System.out.println(newQueue.deQueue());
    }
}