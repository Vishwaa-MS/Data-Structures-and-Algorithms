public class CircularQueue {
     int[] arr;
     int topOfQueue;
     int beginningOfQueue;
     int size;

     public CircularQueue(int size){
         this.arr = new int[size];
         this.beginningOfQueue = -1;
         this.topOfQueue = -1;
         this.size = size;
         System.out.println("Successfully created CircularQueue with size - " + size);
     }

     public boolean isEmpty(){
         return topOfQueue == -1; // we can also use beginning of Queue.
     }

     public boolean isFull(){
         return (beginningOfQueue == topOfQueue + 1) || (beginningOfQueue == 0 && topOfQueue + 1 == size);
     }

     public void enQueue(int value){
         if(isFull()){
             System.out.println("The queue is full. ");
         } else if (isEmpty()) {
             beginningOfQueue = 0;
             topOfQueue++;
             arr[topOfQueue] = value;
             System.out.println("Successfully inserted the value "+value+" in queue");
         } else {
             if(topOfQueue + 1 == size){
                 topOfQueue = 0;
             } else {
                 topOfQueue++;
             }
             arr[topOfQueue] = value;
             System.out.println("Successfully inserted the value "+value+" in queue");
         }
     }

     public int deQueue(){
         if(isEmpty()){
             System.out.println("The CircularQueue is empty. ");
             return  -1;
         } else {
             int result = arr[beginningOfQueue];
             arr[beginningOfQueue] = 0;
             if(beginningOfQueue == topOfQueue){
                 beginningOfQueue = topOfQueue = -1;
             } else if (beginningOfQueue+1 == size){
                beginningOfQueue = 0;
             } else {
                 beginningOfQueue++;
             }
             return result;
         }
     }

     public int peek(){
         if(isEmpty()){
             System.out.println("The CircularQueue is empty. ");
             return -1;
         } else {
             return arr[beginningOfQueue];
         }
     }

     public void deleteCircularQueue(){
         arr = null;
         System.out.println("Successfully deleted from the memory. ");
     }
}
