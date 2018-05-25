package custom.stack;

public interface IStack<T extends Comparable<T>> {

    void push(T data);

    T pop();

    T peek();

    int size();

}