package ejercicios;


public interface ILista {
    public void insertBegin(Object element);
    public void insertFinal(Object element);
    public void insertInIndex(Object element, int index);
    public Nodo deleteFinal();
    public Nodo deleteBegin();
    public Nodo deleteInIndex(int index);
    public void printList();
    public boolean isEmpty();
}
