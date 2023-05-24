package colas;

public class ArrayQueue implements IQueue{
    
    private Nodo[] array;
    private Integer head, tail;
    private int size, maxSize; 

    public ArrayQueue() {
        this.array = new Nodo[1];
        this.head = 0;
        this.tail = 0;
        this.size = 1;
        this.maxSize = 10;
    }
    
    public int searchSpace() {
        for (int i = 0; i < getSize(); i++) {
            if (getArray()[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void enqueue(Object element) {
         Nodo node = new Nodo(element);
        if (isEmpty()) {
            getArray()[getHead()] = node;
            setTail(getHead());
        } else {
            if (getSize() >= getMaxSize()) {
                System.out.println("No hay espacio disponible");
            } else {
                int position = searchSpace();
                if(position == -1) {
                    Nodo[] newArray = new Nodo[getSize()+1];
                    for (int i = 0; i < getSize(); i++) {
                        newArray[i] = getArray()[i];
                    }
                    newArray[getSize()] = node;
                    getArray()[getTail()].setNext(getSize());
                    setTail(getSize());
                    setSize(getSize()+1);
                    setArray(newArray);
                   
                } else {
                    getArray()[position] = node;
                    getArray()[getTail()].setNext(position);
                    setTail(position);
                }
            }
        }
    }

    @Override
    public void dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Nodo dispatch() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        return getArray()[getHead()] == null;
    }

    @Override
    public void printQueue() {
        Nodo pointer = getArray()[getHead()];
        while (pointer.getNext() != null) {
            System.out.println("NODO:"+pointer.getElement());
            pointer = getArray()[(int) pointer.getNext()];
        }
        System.out.println("NODO:"+ getArray()[getTail()].getElement());
    }

    public Nodo[] getArray() {
        return array;
    }

    public void setArray(Nodo[] array) {
        this.array = array;
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public Integer getTail() {
        return tail;
    }

    public void setTail(Integer tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    
    
}
