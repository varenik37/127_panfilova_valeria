import java.util.Arrays;

public class DynamicArray<T> {
    private int size;
    private int capacity;
    private Object[] data;
    public static final int DefaultSize = 1024;

    public DynamicArray() {
        data = new Object[DefaultSize];
        size = DefaultSize;
        capacity = DefaultSize;
    }

    public DynamicArray(int size) {
        if size (size < 0)
            throw NegativeArraySizeException("Size can not be negative");
        data = new Object[size];
        this.size = size;
        capacity = size;
    }

    public void resize(int newSize) {
        if (newSize < 0)
            throw new NegativeArraySizeException("Size can not be negative");
        if (newSize != capacity) {
            capacity = newSize;
            data = Arrays.copyOf(data, newSize);
        }
        size = newSize;
    }

    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");
        return (T)data[index];
    }


}
