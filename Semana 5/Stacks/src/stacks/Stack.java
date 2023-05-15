package stacks;


public class Stack implements IPilas {
    private Nodo peek;
    private int length;

    public Stack() {
        this.peek = null;
        this.length = 0;
    }


    @Override
    public void push(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            nodo.setNext(getPeek());
            setPeek(nodo);
        }
        length++;
    }

    @Override
    public void pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            Nodo pointer = getPeek();
            setPeek(getPeek().getNext());
            pointer.setNext(null);
            length--;
        }
    }
    

    @Override
    public boolean isEmpty() {
        return getPeek() == null;
    }

    @Override
    public Nodo getPeek() {
        return peek;
    }

    @Override
    public void setPeek(Nodo nodo) {
        
        this.peek = nodo;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public void printStack() {
        Nodo pointer = getPeek();
        while (pointer != null){
            System.out.println("[ "+pointer.getElement()+" ]");
            pointer = pointer.getNext();
        }
    }
    
}
