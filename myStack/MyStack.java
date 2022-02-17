package myStack;
import java.util.EmptyStackException;

public class MyStack<E> implements getMyStack<E> {
    private int size = 0;
    private Node<E> head;
    private Node<E> last;

    @Override
    public void push(E value) {if (head == null) {
        head = new Node<>(value, null, null);
        last = head;
    } else {
        Node<E> newNode = new Node<>(value, last, null);
        last.next = newNode;
        last = newNode;
    }

        size++;
    }


    @Override
    public E remove(int index) {
        Node<E> nodeToRemove = findNodeByIndex(index);

        E nodeToRemoveValue = nodeToRemove.value;

        if (size == 1) {
            clear();

            return nodeToRemoveValue;
        }
        Node<E> prevNodeOfRemoved = nodeToRemove.prev;
        Node<E> nextNodeOfRemoved = nodeToRemove.next;

        if (prevNodeOfRemoved == null) {
            nextNodeOfRemoved.prev = null;
            head = nextNodeOfRemoved;
        } else if (nextNodeOfRemoved == null) {
            prevNodeOfRemoved.next = null;
            last = prevNodeOfRemoved;
        } else {
            prevNodeOfRemoved.next = nextNodeOfRemoved;
            nextNodeOfRemoved.prev = prevNodeOfRemoved;
        }
        size--;
        nodeToRemove.next = nodeToRemove.prev = null;

        return nodeToRemoveValue;
    }

    private Node<E> findNodeByIndex(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<E> result;

        if (index > size / 2) {
            result = last;

            for (int i = 0; i < size - index - 1; i++) {
                result = result.prev;
            }
        } else {
            result = head;

            for (int i = 0; i < index; i++) {
                result = result.next;
            }
        }
        return result;
    }

    @Override
    public void clear() {
        Node<E> node = head;

        while (node != null) {
            Node<E> next = node.next;
            node.prev = node.next = null;

            node = next;
        }

        head = last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        return last.value;
    }

    @Override
    public E pop() {
        E result = peek();
        remove(size - 1);

        return result;
    }

    private static class Node<E> {
        private final E value;
        Node<E> next;
        Node<E> prev;

        public Node(E value, Node<E> prev, Node<E> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
