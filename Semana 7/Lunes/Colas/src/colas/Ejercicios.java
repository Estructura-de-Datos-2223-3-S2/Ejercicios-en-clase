package colas;

public class Ejercicios {
    
    public void Ejercicio1(Queue queue) {
        int acum = 0;
        Nodo pointer = queue.getHead();
        while (pointer != null) {
            acum += (int) pointer.getElement();
            pointer = (Nodo) pointer.getNext();
        }
        if (!queue.isEmpty()){
            System.out.println("El promedio es:"+(double)(acum/queue.getSize()));
        }
        
        Nodo pointer2 = (Nodo) queue.getHead();
        int cont = queue.getSize()-1;
        int cont2 = 0;
        int cont3 =0;
        boolean firstTime = true;
        while ((pointer2 != queue.getHead() || firstTime)){
            firstTime = false;
            while (cont2 < cont) {
                pointer2 = (Nodo) pointer2.getNext();
                cont2++;
            }
            System.out.println(pointer2.getElement());
            cont--;
            cont2 = 0;
            pointer2 = (Nodo) queue.getHead().getNext();
            cont3++;
            if (cont3 == queue.getSize()){
                break;
            }
        }
    }
    
}
