package listasdobles;

public class ListaDoble implements ILista{
    private NodoDoble head, tail;
    private int size;

    public ListaDoble() {
        this.head = this.tail = null;
        this.size = 0;
    }

    public NodoDoble getHead() {
        return head;
    }

    public void setHead(NodoDoble head) {
        this.head = head;
    }

    public NodoDoble getTail() {
        return tail;
    }

    public void setTail(NodoDoble tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void insertBegin(Object element) {
        NodoDoble node = new NodoDoble(element);
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            getHead().setPrevious(node);
            node.setNext(getHead());
            setHead(node);
        }
        size++;
    }

    @Override
    public void insertFinal(Object element) {
        NodoDoble node = new NodoDoble(element);
        if(isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            NodoDoble pointer = getTail();
            node.setPrevious(pointer);
            pointer.setNext(node);
            setTail(node);
        }
        size++;
    }

    @Override
    public void insertInIndex(Object element, int index) {
        
    }

    @Override
    public NodoDoble deleteFinal() {
        if(isEmpty()) {
            System.out.println("No hay elementos en la lista");
        } else {
            NodoDoble pointer = getTail();
            if (getSize() == 1) {
                setHead(null);
                setTail(null);
            } else {
                NodoDoble pointer2 = pointer.getPrevious();
                pointer.setPrevious(null);
                pointer2.setNext(null);
                setTail(pointer2);
            }
            size--;
            return pointer;
        }
        return null;
    }

    @Override
    public NodoDoble deleteBegin() {
        if(isEmpty()) {
            System.out.println("No hay elementos en la lista");
        } else {
            NodoDoble pointer = getHead();
            if (getSize() == 1) {
                setHead(null);
                setTail(null);
            } else {
                NodoDoble pointer2 = pointer.getNext();
                pointer.setNext(null);
                pointer2.setPrevious(null);
                setHead(pointer2);
            }
            size--;
            return pointer;
        }
        return null;
    }

    @Override
    public NodoDoble deleteInIndex(int index) {
        if(isEmpty()) {
            System.out.println("No hay elementos en la lista");
        } else if( index >= getSize()){
            System.out.println("Error en indice");
        } else {
            if (index < getSize()/2) {
                NodoDoble pointer = getHead();
                if (index == 0){
                    deleteBegin();
                } else {
                    NodoDoble pointer2;
                    int cont = 0;
                    while ( cont< index-1 && pointer != null) {
                        pointer = (NodoDoble) pointer.getNext();
                        cont++;
                    }
                    pointer2 = pointer.getNext();
                    pointer.setNext(pointer2.getNext());
                    pointer2.getNext().setPrevious(pointer);
                    pointer2.setNext(null);
                    pointer2.setPrevious(null);
                    return pointer2;
                }
            } else {
                NodoDoble pointer = getTail();
                if (index == getSize()-1){
                    deleteFinal();
                } else {
                    NodoDoble pointer2;
                    int cont = 0;
                    while ( cont< (getSize()-index) && pointer != null) {
                        pointer = (NodoDoble) pointer.getPrevious();
                        cont++;
                    }
                    //System.out.println(pointer.getElement());
                    pointer2 = pointer.getNext();
                    pointer.setNext(pointer2.getNext());
                    pointer2.getNext().setPrevious(pointer);
                    pointer2.setNext(null);
                    pointer2.setPrevious(null);
                    return null;
                }
            }
            size--;
        }
        return null;
    }

    @Override
    public void printList() {
        NodoDoble pointer = getHead();
        while (pointer != null) {
            System.out.print("[ "+pointer.getElement()+" ]");
            pointer = pointer.getNext();
        }
    }

    @Override
    public boolean isEmpty() {
        return getHead() == null && getTail() == null;
    }
    
    
    
    
}
