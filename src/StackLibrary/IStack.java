package StackLibrary;

public interface IStack<V> {

    public boolean isEmpty();

    public void push(V v);

    public Element<V> top();

    public Element<V> pop();

}