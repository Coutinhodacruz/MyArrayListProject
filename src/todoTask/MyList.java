package todoTask;

public interface MyList {

    Object add(Object element);

    void delete(Object element );

    Object get(int index);

    int getCapacity();


    int getListSize();

}
