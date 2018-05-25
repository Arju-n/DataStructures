package custom.stack;

public class StackArrayImpl<T>{

    private T[] stackArr;
    private int currentSize;

    public StackArrayImpl(int arrSize) {

        this.stackArr = createArray(arrSize);
    }

    private T[] createArray(int size){
        return (T[]) new Object[size];
    }

    public void push(T data) {
        if (currentSize < stackArr.length)
            stackArr[currentSize] = data;
        else {
            stackArr = resizeArr(stackArr.length * 2);
            stackArr[currentSize] = data;
        }
        currentSize++;
    }

    private T[] resizeArr(int newLength) {
        T[] newArray = createArray(newLength);
        System.arraycopy(stackArr, 0, newArray, 0, currentSize);
        return newArray;
    }

    public T pop() {
        if (currentSize <= stackArr.length / 4) {
            stackArr= resizeArr(stackArr.length / 2);
        }
        return stackArr[--currentSize];
    }

    public T peek() {
        return stackArr[currentSize];
    }


    public int size() {
        return currentSize;
    }


}