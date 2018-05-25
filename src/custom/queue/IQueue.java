package custom.queue;

import java.util.NoSuchElementException;

/**
 * Created by Arjun on 10-Sep-17.
 */
public interface IQueue<T extends Comparable<T>> {

    void add(T data);
    T remove() throws NoSuchElementException;
    T peek();
    int size();
}
