package my_list;

import java.util.Arrays;

public class MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int currentCapacity = DEFAULT_CAPACITY;
    private int size = 0;
    private T []  elementData = (T[]) new Object[currentCapacity];

    public T [] add(T o) {
        if (currentCapacity == size) increaseCapacity();
        elementData[size] = o;
        size++;
        return elementData;
    }

    private void increaseCapacity() {
        currentCapacity += 10;
        elementData = Arrays.copyOf(elementData, currentCapacity);
    }

    public T get(int index) {
        if (index < size || index < 0)
        return elementData [index];
        else throw new IndexOutOfBoundsException("Index Out Of Bounds");
    }

    public int size() {
        return size;
    }

}
