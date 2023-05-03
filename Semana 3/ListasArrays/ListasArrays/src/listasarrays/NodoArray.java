package listasarrays;

public class NodoArray {
    private Object element;
    private Integer next;

    public NodoArray(Object elemento) {
        this.element = elemento;
        this.next = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object elemento) {
        this.element = elemento;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer siguiente) {
        this.next = siguiente;
    }
    
    
    
    
}
