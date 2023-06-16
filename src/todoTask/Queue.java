package todoTask;

import customException.QueueEmptyException;

public interface Queue {


   void enqueue(Object element);

    Object dequeue() throws QueueEmptyException;
}
