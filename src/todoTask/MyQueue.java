package todoTask;

import customException.QueueEmptyException;
import customException.QueueFullException;

public class MyQueue implements Queue{

    private MyArrayList queue = new MyArrayList();



    public void enqueue(Object element) {
        queue.add(element);
    }

    public Object dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue is empty");
        }
        return queue.remove(0);
    }

    public Object peek() throws QueueFullException {
        if (isEmpty()) {
            throw new QueueFullException("Queue is empty");
        }
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.getListSize() == 0;
    }

    public int size() {
        return queue.getListSize();
    }
}

