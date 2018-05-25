package custom.tree.balanced.avl;

/**
 * Created by Arjun_Arjun01 on 9/19/2017.
 */
public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;
    private int height;

    Node(T data){
        this.data =data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return this.data.toString();
    }


}
