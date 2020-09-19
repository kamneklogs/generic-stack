package StackLibrary;

public class Element<V> {
    
    private V v;
    private Element<V> prevElement;

    public Element() {
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public Element<V> getPrevElement() {
        return prevElement;
    }

    public void setPrevElement(Element<V> prevElement) {
        this.prevElement = prevElement;
    }

}