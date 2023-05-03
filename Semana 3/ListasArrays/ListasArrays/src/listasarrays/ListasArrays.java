package listasarrays;


public class ListasArrays {
    
    private NodoArray[] array;
    private int head;
    private int maxSize;
    private int size;

    public ListasArrays(int maxSize) {
        this.size = 1;
        this.array = new NodoArray[1];
        this.maxSize = maxSize;
        this.head = 0;
    }
    
    public boolean isEmpty() {
        return getArray()[getHead()] == null; 
    }

    public NodoArray[] getArray() {
        return array;
    }

    public void setArray(NodoArray[] array) {
        this.array = array;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public int searchSpace() {
        for (int i = 0; i < getSize(); i++) {
            if(getArray()[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    public void insertBegin(Object object) {
        NodoArray node = new NodoArray(object);
        if (isEmpty()) {
            getArray()[0] = node;
        } else {
            int position = searchSpace();
            if(position != -1) {
                getArray()[position] = node;
                node.setNext(getHead());
                setHead(position);
            } else {
                if (getSize() == getMaxSize()) {
                    System.out.println("No hay espacio disponible");
                } else {
                    NodoArray[] newArray = new NodoArray[getSize()+1];
                    for (int i = 0; i < getSize(); i++) {
                        newArray[i] = getArray()[i];
                    }
                    node.setNext(getHead());
                    setHead(getSize());
                    newArray[getSize()] = node;
                    setSize(getSize()+1);
                    setArray(newArray);
                }
            }
        }
    }
    
    public Object deleteBegin() {
        NodoArray pointer = getArray()[getHead()];
        getArray()[getHead()] = null;
        setHead(pointer.getNext());
        return pointer.getElement();
    }
}
