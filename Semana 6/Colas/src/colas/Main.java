package colas;


public class Main {


    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        //queue.dequeue();
        //queue.dispatch();
        queue.printQueue();
    }
    
}
