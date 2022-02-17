package myQueue;

public interface MyQueueInterface<E> {

    void add(E value);

    E remove(int index);

    void clear();

    int size();

    E peek();

    E poll();
}
