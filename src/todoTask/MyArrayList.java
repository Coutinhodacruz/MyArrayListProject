package todoTask;

import java.util.Arrays;

public class MyArrayList implements MyList{

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array = new Object[DEFAULT_CAPACITY];
    private int size = 0;

    @Override
    public Object add(Object element) {
        ensureCapacity(size + 1);
        array[size++] = element;

        return null;
    }

    @Override
    public void delete(Object element) {
        int index = indexOf(element);
        if (index >= 0) {
            remove(index);
        }
    }


    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Object removedElement = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size - 1] = null;
        size--;

        return removedElement;
    }


    @Override
    public int getCapacity() {
        return array.length;
    }


    @Override
    public int getListSize()                 {
        return size;
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = getCapacity();
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity + (oldCapacity / 2);
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            array = Arrays.copyOf(array, newCapacity);
        }
    }


    int indexOf(Object element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(array[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    public Object get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}