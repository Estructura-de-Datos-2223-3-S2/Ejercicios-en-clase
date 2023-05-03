package listasdobles;


public interface ILista {
    public void insertBegin(Object element);
    public void insertFinal(Object element);
    public void insertInIndex(Object element, int index);
    public NodoDoble deleteFinal();
    public NodoDoble deleteBegin();
    public NodoDoble deleteInIndex(int index);
    public void printList();
    public boolean isEmpty();
}
