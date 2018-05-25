package custom.tree.bst;

/**
 * Created by Arjun on 10-Sep-17.
 */
public interface ITree<T extends Comparable<T>> {

    void insert(T data);
    void delete(T data);
    T getMax();
    T getMin();
    void traverse();
    int size();
}
