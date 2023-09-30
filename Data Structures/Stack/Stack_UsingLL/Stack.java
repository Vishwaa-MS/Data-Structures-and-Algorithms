import jdk.jshell.EvalException;

public class Stack {
    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    //Push method
    // Time complexity ---> O(1)
    // Space complexity ---> O(1)
    public void push(int value) {
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted value successfully " + value + " in stack. ");
    }

    //isEmpty method
    // Time complexity ---> O(1)
    // Space complexity ---> O(1)

    public boolean isEmpty() {
        return linkedList.head == null;
    }

    //Pop method
    // Time complexity ---> O(1)
    // Space complexity ---> O(1)
    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The stack is empty. ");
        } else {
            result = linkedList.head.value;
            linkedList.head = linkedList.head.next;
        }
        return result;
    }

    //Peek method
    // Time complexity ---> O(1)
    // Space complexity ---> O(1)
    public int peek() {

        if (isEmpty()) {
            System.out.println("The stack is empty. ");
            return -1;
        } else {
            return linkedList.head.value;

        }

    }



    //Delete method
    // Time complexity ---> O(1)
    // Space complexity ---> O(1)

    public void deleteStack(){
        if(isEmpty()){
            System.out.println("The stack does not exist.");
        } else {
            linkedList.head = null;
            System.out.println("Stack deleted successfully. ");
        }
    }
}
