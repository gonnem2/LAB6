import java.util.EmptyStackException;

public class MyStack<T> {
    private T[] data;
    private int size;

    public MyStack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }


    public void push(T element) {
        if (size == data.length){
            int newCapacity = data.length * 2;
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(data, 0, newElements, 0, size);
            data = (T[]) newElements;
        }
        data[size++] = element;
    }

    public T pop() {
        if (size == 0){
            throw new EmptyStackException();
        }
        T item = (T) data[--size];
        data[size] = null;
        return item;
    }
    public T peek() {
        if (size <= 0) throw new EmptyStackException();
        return (T) data[size - 1];
        }
    }

