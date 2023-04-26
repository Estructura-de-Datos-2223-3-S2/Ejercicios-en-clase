package lista;

/**
 *
 * @author Estudiante
 */
public class Lista implements ILista{
    
    private Nodo head;
    private int length;

    public Lista() {
        this.head = null;
        this.length = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }
    
    public boolean isEmpty() {
        return getHead() == null;
    }
    
    public void insertBegin(int element) {
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            node.setNext(getHead());
            setHead(node);
        }
        length++;
    }
    
    public void insertFinal(int element) {
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = (Nodo) pointer.getNext();
            }
            pointer.setNext(node);
        }
        length++;
    }
    
    public void insertInIndex(int element, int index) {
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            if (index == 0){
                insertBegin(element);
            } else {
                if (index < length) {
                    Nodo pointer = getHead();
                    int cont = 0;
                    while ( cont< index-1 && pointer != null) {
                        pointer = (Nodo) pointer.getNext();
                        cont++;
                    }
                    node.setNext((Nodo) pointer.getNext());
                    pointer.setNext(node);
                } else {
                    System.out.println("Error in index");
                }
            }
        }
        length++;
    }
    
    public Nodo deleteFinal(){
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Nodo pointer = getHead();
            Nodo pointer2;
            
            if (length > 1){
                while (((Nodo) (pointer.getNext())).getNext() != null) {
                    pointer = (Nodo) pointer.getNext();
                }
                pointer2 = (Nodo) pointer.getNext();
                pointer.setNext(null);
            } else {
                pointer2 = deleteBegin();
            }
            length--;
            return pointer2;
        }
        
        return null;
    }
    
    public Nodo deleteBegin(){
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Nodo pointer = getHead();
            setHead((Nodo) getHead().getNext());
            pointer.setNext(null);
            length--;
            return pointer;
        }
        
        return null;
    }
    
    public Nodo deleteInIndex(int index){
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            if (index == 0){
                deleteBegin();
            } else {
                if (index < length) {
                    Nodo pointer = getHead();
                    Nodo pointer2;
                    int cont = 0;
                    while ( cont< index-1 && pointer != null) {
                        pointer = (Nodo) pointer.getNext();
                        cont++;
                    }
                    pointer2 = (Nodo) pointer.getNext();
                    pointer.setNext((Nodo) pointer2.getNext());
                    pointer2.setNext(null);
                    return pointer2;
                } else {
                    System.out.println("Error in index");
                }
            }
        }
        length++;
        return null;
    }
    
    public void printList() {
        Nodo pointer = getHead();
        while (pointer != null) {
            System.out.print("[ "+pointer.getElement()+" ]");
            pointer = (Nodo) pointer.getNext();
        }
    }

    
}
