public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is successfully created with size of: " + size);
    }

    public boolean isFull(){
        return topOfQueue == arr.length-1;
    }
    public boolean isEmpty(){
        return beginningOfQueue == -1;
    }

    public void enQueue(int value){
        if (isFull()){
            System.out.println("The queue is full.");
        } else if (isEmpty()) {
            beginningOfQueue =0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted the value:" + value);
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted the value:" + value);
        }
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return  -1;
        } else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0 ;
            beginningOfQueue++;
            if(beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            System.out.println("Successfully deleted the value " + result);
            return  result;
        }
    }

    public int peek(){
        if (!isEmpty()){
            return  arr[beginningOfQueue];
        } else {
            System.out.println("The queue is empty! ");
            return  -1;
        }
    }

    public void deleteQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty and nothing to delete. ");
        } else {
            arr = null;
            System.out.println("The queue is successfully deleted");
        }
    }
}
