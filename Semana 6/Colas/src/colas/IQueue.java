
package colas;

public interface IQueue {
    public void enqueue(Object element); 
    public void dequeue(); 
    public Nodo dispatch(); 
    public boolean isEmpty(); 
    public void printQueue(); 
}
