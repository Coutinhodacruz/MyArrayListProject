package todoTask;

public class MyLinkedList {

    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(Object element) {
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

        size++;
    }

    public void remove(Object element) {
        if (head == null) {
            return;
        }

        if (head.data.equals(element)) {
            head = head.next;
            size--;
            return;
        }

        Node currentNode = head;
        Node prevNode = null;

        while (currentNode != null && !currentNode.data.equals(element)) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null) {
            prevNode.next = currentNode.next;
            size--;
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }
    }
}

