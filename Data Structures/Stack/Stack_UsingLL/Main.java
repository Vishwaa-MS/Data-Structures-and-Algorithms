public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack();
        System.out.println(newStack.isEmpty());
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        System.out.println(newStack.isEmpty());
        System.out.println(newStack.peek());
        System.out.println(newStack.peek());
        System.out.println(newStack.peek());
        System.out.println(newStack.peek());
        newStack.deleteStack();
        System.out.println(newStack.isEmpty());
    }
}