/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listascirculares;

/**
 *
 * @author Estudiante
 */
public class ListaCircular implements ILista {

    private Nodo head;
    private int length;

    public ListaCircular() {
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
            getHead().setNext(getHead());
        } else {
            Nodo pointer = getHead();
            Nodo pointer2 = getHead();
            node.setNext(getHead());
            setHead(node);
            while (pointer.getNext() != pointer2) {
                pointer = (Nodo) pointer.getNext();
            }
            pointer.setNext(getHead());
        }
        length++;
    }
    
    public void insertFinal(int element) {
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
            getHead().setNext(getHead());
        } else {
            Nodo pointer = getHead();
            node.setNext(getHead());
            while (pointer.getNext() != getHead()) {
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
            getHead().setNext(getHead());
        } else {
            if (index == 0){
                insertBegin(element);
            } else {
                if (index < length) {
                    if(index == length -1 ){
                        insertFinal(element);
                    } else {
                        Nodo pointer = getHead();
                        int cont = 0;
                        while ( cont< index-1) {
                            pointer = (Nodo) pointer.getNext();
                            cont++;
                        }
                        node.setNext((Nodo) pointer.getNext());
                        pointer.setNext(node);
                    }
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
                while (((Nodo) (pointer.getNext())).getNext() != getHead()) {
                    pointer = (Nodo) pointer.getNext();
                }
                pointer2 = (Nodo) pointer.getNext();
                pointer2.setNext(null);
                pointer.setNext(getHead());
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
            Nodo pointer2 = getHead();
            setHead((Nodo) getHead().getNext());
            while (pointer.getNext() != pointer2) {
                pointer = (Nodo) pointer.getNext();
            }
            pointer.setNext(getHead());
            pointer2.setNext(null);
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
                    if(index == length-1) {
                        deleteFinal();
                    } else {
                        Nodo pointer = getHead();
                        Nodo pointer2;
                        int cont = 0;
                        while ( cont< index-1 ) {
                            pointer = (Nodo) pointer.getNext();
                            cont++;
                        }
                        pointer2 = (Nodo) pointer.getNext();
                        pointer.setNext((Nodo) pointer2.getNext());
                        pointer2.setNext(null);
                        return pointer2;
                    }
                    
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
        boolean firstTime = true;
        while (pointer != getHead() || firstTime) {
            firstTime = false;
            System.out.print("[ "+pointer.getElement()+" ]");
            pointer = (Nodo) pointer.getNext();
        }
    }
    
}
