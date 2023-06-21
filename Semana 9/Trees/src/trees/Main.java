package trees;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insertRecursive(1, -1, null);
        tree.insertRecursive(2, tree.getRoot().getElement(), tree.getRoot());
        tree.insertRecursive(3, tree.getRoot().getElement(), tree.getRoot());
        tree.insertRecursive(4, tree.getRoot().getElement(), tree.getRoot());
        tree.insertRecursive(5, tree.getRoot().getElement(), tree.getRoot());
        tree.insertRecursive(6, tree.getRoot().getElement(), tree.getRoot());
        tree.printPreOrden(tree.getRoot());
        System.out.println("Este fue u arbol sencillo");
        
        tree.insertRecursive(20, 2, tree.getRoot());
        tree.insertRecursive(22, 2, tree.getRoot());
        tree.insertRecursive(24, 2, tree.getRoot());
        tree.insertRecursive(50, 5, tree.getRoot());
        tree.insertRecursive(52, 5, tree.getRoot());
        tree.insertRecursive(54, 5, tree.getRoot());
        
        tree.printPreOrden(tree.getRoot());
    } 
}
