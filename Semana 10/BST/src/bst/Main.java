/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bst;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertNodoRecursive(20, bst.getRoot());
        bst.insertNodoRecursive(10, bst.getRoot());
        bst.insertNodoRecursive(30, bst.getRoot());
        bst.insertNodoRecursive(5, bst.getRoot());
        bst.insertNodoRecursive(25, bst.getRoot());
        bst.insertNodoRecursive(40, bst.getRoot());
        bst.insertNodoRecursive(33, bst.getRoot());
        bst.preOrden(bst.getRoot());
        
        System.out.println("Eliminar");
        bst.deleteNodo(30, bst.getRoot(), null);
        bst.preOrden(bst.getRoot());
    }
    
}
