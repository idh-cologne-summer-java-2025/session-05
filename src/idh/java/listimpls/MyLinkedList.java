package idh.java.listimpls;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {

	class Node<T> {
        T value;
        Node<T> next;
        Node<T> previous;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> first;
    private Node<T> last;
    
    
    private int size = 0;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
       
        
        if (first == null) {
            first = newNode;
            last = first;
        } 
        else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public T get(int index) {
        checkIndex(index);
        //TODO: check if index points on last element, if so: return last 
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    
    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements Iterator<T> {
        private Node<T> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T value = current.value;
            current = current.next;
            return value;
        }
    }
}
