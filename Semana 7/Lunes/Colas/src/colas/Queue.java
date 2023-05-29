package colas;


public class Queue implements IQueue {
    private Nodo head;
    private Nodo tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void enqueue(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setTail(nodo);
            setHead(nodo);
        } else {
            Nodo pointer = getTail();
            pointer.setNext(nodo);
            setTail(nodo);
        }
        size++;
    }

    @Override
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            Nodo pointer = getHead();
            setHead((Nodo) pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null) {
                setTail(null);
            }
            size--;
        }
    }

    @Override
    public Nodo dispatch() {
        if(isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            Nodo pointer = getHead();
            setHead((Nodo) pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null) {
                setTail(null);
            }
            size--;
            return pointer;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return getHead() == null && getTail() == null;
    }

    @Override
    public void printQueue() {
        Nodo pointer = getHead();
        while (pointer != null) {
            System.out.print("[ "+pointer.getElement()+" ]");
            pointer = (Nodo) pointer.getNext();
        }
    }
    
    
    
    
}
