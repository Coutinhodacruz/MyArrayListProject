package queue;

public class Queue {
    private Object[] queue;
    private final int defaultCapacity = 7 ;
    private int currentCapacity;
    private int size;
    private int front;
    private int rear;

    public Queue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer.");
        }
        queue = new Object[capacity];
//        defaultCapacity = capacity;
        currentCapacity = capacity;
        size = 0;
        front = 0;
        rear = -1;
    }

    public void enqueue(Object item) {
        if (size == currentCapacity) {
            increaseCapacity();
        }

        if (queue[(rear + 1) % currentCapacity] == null) {
            rear = (rear + 1) % currentCapacity;
        } else {
            int index = (rear + 1) % currentCapacity;
            while (queue[index] != null) {
                int nextIndex = (index + 1) % currentCapacity;
                queue[nextIndex] = queue[index];
                index = nextIndex;
            }
            rear = index;
        }

        queue[rear] = item;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        Object item = queue[front];
        front = (front + 1) % currentCapacity;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void increaseCapacity() {
        int newCapacity = currentCapacity + 1;
        Object[] newQueue = new Object[newCapacity];

        int j = front;
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[j];
            j = (j + 1) % currentCapacity;
        }

        queue = newQueue;
        front = 0;
        rear = size - 1;
        currentCapacity = newCapacity;
    }

    public boolean checkElementMovement() {
        if (size() >= 2) {
            Object elementAtIndex1 = queue[(front + 1) % currentCapacity];
            Object elementAtIndex2 = queue[(front + 2) % currentCapacity];
            return elementAtIndex1 == null && elementAtIndex2 != null;
        }
        return false;
    }

}


