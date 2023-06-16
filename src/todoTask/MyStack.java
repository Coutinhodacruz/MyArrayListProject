package todoTask;

import java.util.EmptyStackException;

public class MyStack implements Stack{

    private MyArrayList arrayList = new MyArrayList();


    @Override
    public void push(Object element) {
        arrayList.add(element);
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arrayList.remove(arrayList.getListSize() - 1);
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arrayList.get(arrayList.getListSize() - 1);
    }

    public int search(Object element) {
        int index = arrayList.indexOf(element);
        if (index >= 0) {
            return arrayList.getListSize() - index;
        }
        return -1;
    }

    public boolean isEmpty() {
        return arrayList.getListSize() == 0;

    }

    public int getSize(){
        return arrayList.getListSize();
    }


}
