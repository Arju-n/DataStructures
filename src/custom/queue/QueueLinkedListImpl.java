package custom.queue;

import custom.node.Node;

import java.util.NoSuchElementException;

/**
 * Created by Arjun on 10-Sep-17.
 */
public class QueueLinkedListImpl<T extends Comparable<T>> implements IQueue<T>{
    private Node<T> head;
    private Node<T> tail;
    private int currentSize;

    @Override
    public void add(T data) {
        Node<T> newNode = new Node(data);
        if(currentSize==0){
            head=newNode;
            tail=head;
        }else{
            Node oldTail=tail;
            oldTail.setNextNode(newNode);
            tail = newNode;
        }
        currentSize++;
    }

    @Override
    public T remove() {
        if(currentSize==0){
            throw new NoSuchElementException("Queue is Empty !");
        }

        Node<T> toBeRemoved =head;
        head=toBeRemoved.getNextNode();
        currentSize--;
        return toBeRemoved.getData();
    }

    @Override
    public T peek() {
        if(currentSize==0){
            throw new NoSuchElementException("Queue is Empty !");
        }
        return head.getData();
    }

    @Override
    public int size() {
        return currentSize;
    }
}
