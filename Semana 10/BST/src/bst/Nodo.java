/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bst;

/**
 *
 * @author Estudiante
 */
public class Nodo {
    
    private int element;
    private Nodo leftSon, rightSon;

    public Nodo(int element) {
        this.element = element;
        this.leftSon = null;
        this.rightSon = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Nodo getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Nodo leftSon) {
        this.leftSon = leftSon;
    }

    public Nodo getRightSon() {
        return rightSon;
    }

    public void setRightSon(Nodo rightSon) {
        this.rightSon = rightSon;
    }
    
    public boolean isLeaf(){
        return (leftSon == null && rightSon == null);
    }
    
    public boolean hasOnlyRightSon(){
        return (leftSon == null && rightSon != null);
    }
    
    public boolean hasOnlyLeftSon(){
        return (leftSon != null && rightSon == null);
    }
}
