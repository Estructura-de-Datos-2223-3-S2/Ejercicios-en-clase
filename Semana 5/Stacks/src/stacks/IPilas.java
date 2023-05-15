package stacks;

public interface IPilas {
    public void push(Object element);
    public void pop();
    public boolean isEmpty();
    public Nodo getPeek();
    public void setPeek(Nodo nodo);
    public int getLength();
    public void printStack();
}
