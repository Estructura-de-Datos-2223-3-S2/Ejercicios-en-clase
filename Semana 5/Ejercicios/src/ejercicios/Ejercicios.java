
package ejercicios;


public class Ejercicios {

    public static void main(String[] args) {
        Lista list = new Lista();
        Lista list2 = new Lista();
        Lista list3 = new Lista();
        
        //Ejercicio 10
        /*list.insertFinal("a");
        list.insertFinal("r");
        list.insertFinal("e");
        list.insertFinal("p");
        list.insertFinal("e");
        list.insertFinal("r");
        list.insertFinal("a");
        list.printList();
        System.out.println(list.isPalindrome());*/
        
        
        //Ejercicio 14
        for (int i = 0; i < 10; i++) {
            list.insertFinal(i);
        }
        
        for (int i = 0; i < 3; i++) {
            list2.insertFinal(i);
        }
        
        for (int i = 0; i < 6; i++) {
            list3.insertFinal(i);
        }
        
        Lista listaFinal = sumaLista(list, list2, list3);
        listaFinal.printList();
    }
    
    public static Lista sumaLista(Lista lista1,Lista lista2,Lista lista3){
        Lista list = new Lista();
        Nodo pointer1 = lista1.getHead();
        Nodo pointer2 = lista2.getHead();
        Nodo pointer3 = lista3.getHead();
        while (
                pointer1 != null ||
                pointer2 != null || 
                pointer3 != null
                ){
            int value = 0;
            if (pointer1 != null){
                value += (int) pointer1.getElement();
                pointer1 = pointer1.getNext();
            }
            if (pointer2 != null){
                value += (int) pointer2.getElement();
                pointer2 = pointer2.getNext();
            }
            if (pointer3 != null){
                value += (int) pointer3.getElement();
                pointer3 = pointer3.getNext();
            }
            list.insertFinal(value);
        }
        return list;
    }
    
}
