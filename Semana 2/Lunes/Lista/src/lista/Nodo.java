package lista;

public class Nodo {
    private int element;
    private Nodo next;

    public Nodo(int element) {
        this.element = element;
        this.next = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    
    
    
}
