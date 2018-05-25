package custom.tree.balanced.avl;

/**
 * Created by Arjun_Arjun01 on 9/19/2017.
 */
public interface ITree<T extends Comparable<T>> {

    void insert(T data);
    void traverse();
}
