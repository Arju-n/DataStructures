package custom.stack;

import custom.node.Node;

public class StackLinkedListImpl<T extends Comparable<T>> implements IStack<T> {

    private Node<T> top;
    private int currentSize;


    @Override
    public void push(T data) {
        if (top == null)
            top = new Node<>(data);

        else {
            Node<T> node = new Node<>(data);
            node.setNextNode(top);
            top = node;
        }
        this.currentSize++;


    }

    @Override
    public T pop() {
        Node<T> oldTop = top;
        Node<T> newTop = top.getNextNode();
        top = newTop;
        this.currentSize--;
        return oldTop.getData();
    }

    @Override
    public T peek() {
        return this.top.getData();
    }

    @Override
    public int size() {
        return this.currentSize;
    }


}
