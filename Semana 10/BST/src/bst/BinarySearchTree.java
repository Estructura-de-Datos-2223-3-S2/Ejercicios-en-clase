package bst;

public class BinarySearchTree {

    private Nodo root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public void insertNodoRecursive(int element, Nodo raiz) {
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setRoot(node);
        } else {
            if (element < raiz.getElement()) {
                if (raiz.getLeftSon() == null) {
                    raiz.setLeftSon(node);
                } else {
                    insertNodoRecursive(element, raiz.getLeftSon());
                }
            } else {
                if (raiz.getRightSon() == null) {
                    raiz.setRightSon(node);
                } else {
                    insertNodoRecursive(element, raiz.getRightSon());
                }
            }
        }
    }

    public void preOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.println("[ " + raiz.getElement() + " ]");
            preOrden(raiz.getLeftSon());
            preOrden(raiz.getRightSon());
        }
    }

    public void inOrden(Nodo raiz) {
        if (raiz != null) {
            preOrden(raiz.getLeftSon());
            System.out.println("[ " + raiz.getElement() + " ]");
            preOrden(raiz.getRightSon());
        }
    }

    public void postOrden(Nodo raiz) {
        if (raiz != null) {
            preOrden(raiz.getLeftSon());
            preOrden(raiz.getRightSon());
            System.out.println("[ " + raiz.getElement() + " ]");
        }
    }

    public void deleteNodo(int element, Nodo raiz, Nodo previousNode) {
        if (isEmpty()) {
            System.out.println("There are not elements to delete");
        } else {
            if (element == raiz.getElement()) {
                if (raiz.isLeaf()) {
                    // Cuando es una hoja
                    if (previousNode == null) {
                        setRoot(null);
                    } else {
                        if (element < previousNode.getElement()) {
                            previousNode.setLeftSon(null);
                        } else {
                            previousNode.setRightSon(null);
                        }
                    }
                } else if (raiz.hasOnlyRightSon()) {
                    // Cuando tiene hijo derecho
                    if (previousNode == null) {
                        setRoot(raiz.getRightSon());
                    } else {
                        if (element < previousNode.getElement()) {
                            previousNode.setLeftSon(raiz.getRightSon());
                        } else {
                            previousNode.setRightSon(raiz.getRightSon());
                        }
                    }
                } else if (raiz.hasOnlyLeftSon()) {
                    // Cuando tiene hijo izquierdo
                    if (previousNode == null) {
                        setRoot(raiz.getLeftSon());
                    } else {
                        if (element < previousNode.getElement()) {
                            previousNode.setLeftSon(raiz.getLeftSon());
                        } else {
                            previousNode.setRightSon(raiz.getLeftSon());
                        }
                    }
                } else {
                    // Tiene ambos hijos
                    boolean haveRightSons = validateLeftSon(raiz.getLeftSon());
                    if (haveRightSons) {
                        Nodo nodo = searchNodoToReplace(raiz.getLeftSon());
                        nodo.setLeftSon(raiz.getLeftSon());
                        nodo.setRightSon(raiz.getRightSon());
                        if (element < previousNode.getElement()) {
                            previousNode.setLeftSon(nodo);
                        } else {
                            previousNode.setRightSon(nodo);
                        }
                    } else {
                        Nodo nodo = raiz.getLeftSon();
                        nodo.setRightSon(raiz.getRightSon());
                        if (element < previousNode.getElement()) {
                            previousNode.setLeftSon(nodo);
                        } else {
                            previousNode.setRightSon(nodo);
                        }
                    }
                }
            } else if(element < raiz.getElement()) {
                deleteNodo(element, raiz.getLeftSon(), raiz);
            } else {
                deleteNodo(element, raiz.getRightSon(), raiz);
            }
        }
    }
    
    public boolean validateLeftSon(Nodo raiz) {
        return raiz.getRightSon() != null;
    }
    
    public Nodo searchNodoToReplace(Nodo raiz){
        while(raiz.getRightSon() != null) {
            raiz = raiz.getRightSon();
        }
        return raiz;
    }

    public boolean isEmpty() {
        return getRoot() == null;
    }

}
