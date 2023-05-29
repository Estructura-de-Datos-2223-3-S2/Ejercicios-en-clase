package colas;


public class Main {


    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        //queue.dequeue();
        //queue.dispatch();
        Ejercicios ej = new Ejercicios();
        ej.Ejercicio1(queue);
        //queue.printQueue();
    }
    
}
