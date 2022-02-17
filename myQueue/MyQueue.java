package myQueue;

class MyQueue<E> implements MyQueueInterface<E> {
    private int size = 0;
    private Node<E> head;
    private Node<E> last;

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

    @Override
    public void add(E value) {
        if (value == null) {
            throw new NullPointerException();
        }

        if (head == null) {
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
        if (head != null) {
            return head.value;
        }

        return null;
    }

    @Override
    public E poll() {
        E result = peek();

        if (head != null) {
            remove(0);
        }

        return result;
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


}
