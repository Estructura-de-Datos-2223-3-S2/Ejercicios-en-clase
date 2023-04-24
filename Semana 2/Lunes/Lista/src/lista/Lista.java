/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author Estudiante
 */
public class Lista {
    
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
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        length++;
    }
    
    public void insertInIndex(int element) {
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        length++;
    }
    
    public void printList() {
        Nodo pointer = getHead();
        while (pointer != null) {
            System.out.print("[ "+pointer.getElement()+" ]");
            pointer = pointer.getNext();
        }
    }
    
}
