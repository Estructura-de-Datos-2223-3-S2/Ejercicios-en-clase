package trees;


public class Nodo {
    
    private Integer element;
    private Nodo[] sons;

    public Nodo(Integer element) {
        this.element = element;
        this.sons = new Nodo[0];
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public Nodo[] getSons() {
        return sons;
    }

    public void setSons(Nodo[] sons) {
        this.sons = sons;
    }
    
    public boolean isLeaf() {
        return sons == null || sons.length == 0;
    }
    
}
