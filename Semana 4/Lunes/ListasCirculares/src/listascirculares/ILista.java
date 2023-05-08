package listascirculares;


public interface ILista {
    public void insertBegin(int element);
    public void insertFinal(int element);
    public void insertInIndex(int element, int index);
    public Nodo deleteFinal();
    public Nodo deleteBegin();
    public Nodo deleteInIndex(int index);
    public void printList();
    public boolean isEmpty();
}
