/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listascirculares;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular list = new ListaCircular();
        for (int i = 0; i < 10; i++) {
            list.insertFinal(i);
        }
        list.printList();
        list.insertInIndex(25, 6);
        System.out.println("");
        list.deleteInIndex(3);
        list.printList();
    }
    
}
