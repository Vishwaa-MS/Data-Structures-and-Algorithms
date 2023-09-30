public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(4);

        newStack.push(5);
        newStack.push(6);
        newStack.push(5);
        newStack.push(6);
        int result1= newStack.peek();
        System.out.println(result1);
        int result2= newStack.peek();
        System.out.println(result2);
        newStack.deleteStack();
        System.out.println(newStack.isEmpty());

    }
}