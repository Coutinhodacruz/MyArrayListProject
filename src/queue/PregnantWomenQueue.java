package queue;

import java.util.Arrays;

public class PregnantWomenQueue<E> {
    private Object[] queue;
    private int size;
    private int front;

    public PregnantWomenQueue() {
        queue = new Object[5];
        size = 0;
        front = 0;
    }

    public void addOnePregnantWoman(E pregnantWoman) {
        if (size == queue.length) {
            increaseCapacity();
        }
        int rear = (front + size) % queue.length;
        queue[rear] = pregnantWoman;
        size++;
    }

    public void addMultiplePregnantWomenAtOnce(E... pregnantWomen) {
        int availableCapacity = queue.length - size;
        if (pregnantWomen.length > availableCapacity) {
//            increaseCapacity(size + pregnantWomen.length);
        }
        int rear = (front + size) % queue.length;
        for (E woman : pregnantWomen) {
            queue[rear] = woman;
            rear = (rear + 1) % queue.length;
            size++;
        }
    }

    public E remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        E value = (E) queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return value;
    }

    public E getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
        int actualIndex = (front + index) % queue.length;
        return (E) queue[actualIndex];
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) queue[front];
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return queue.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void increaseCapacity() {
        int newCapacity = queue.length * 2;
        Object[] newQueue = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front + i) % queue.length];
        }

        queue = newQueue;
        front = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
