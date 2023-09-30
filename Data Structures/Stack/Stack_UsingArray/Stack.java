public class Stack {
    int[] arr;
    int topOfStack;

    // Creating Stack
    // Time complexity ---> O(1)
    // Space complexity ---> O(n)
    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of: " + size);
    }

    //isEmpty() method
    // Time complexity ---> O(1)
    // Space complexity ---> O(1)
    public boolean isEmpty(){
        return topOfStack == -1;
    }

    //isFull() method
    // Time complexity ---> O(1)
    // Space complexity ---> O(1)
    public boolean isFull(){
         if(topOfStack == arr.length-1){
             //System.out.println("The stack is full. ");
             return true;
         } else {
        return false;
         }
    }

    //Push method
    // Time complexity ---> O(1)
    // Space complexity ---> O(1)
    public void push(int value){
        if(isFull()){
            System.out.println("The stack is full.\nThe value is not inserted. ");
        } else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    //Pop method
    // Time complexity ---> O(1)
    // Space complexity ---> O(1)

    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    //peek method
    // Time complexity ---> O(1)
    // Space complexity ---> O(1)
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty. ");
            return -1;
        } else {
             return arr[topOfStack];
        }
    }

    //Delete method
    // Time complexity ---> O(1)
    // Space complexity ---> O(1)

    public void deleteStack(){
        arr = null;
        topOfStack=-1;
        System.out.println("The stack is successfully deleted. ");
    }
}
