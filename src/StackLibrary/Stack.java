package StackLibrary;

public class Stack<V> implements IStack<V> {

    private Element<V> top;

    public Stack() {

    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return top == null;
    }

    @Override
    public void push(V v) {
        Element<V> theE = new Element<V>();
        theE.setV(v);

        if (isEmpty()) {
            top = theE;

        } else {
            theE.setPrevElement(top);
            top = theE;
        }
    }

    @Override
    public Element<V> top() {
        // TODO Auto-generated method stub
        return top;
    }

    @Override
    public Element<V> pop() {

        Element<V> t = top;
        // TODO Auto-generated method stub
        if (top.getPrevElement() == null) {
            top = null;
        } else {

            top = top.getPrevElement();

        }

        return t;

    }

}