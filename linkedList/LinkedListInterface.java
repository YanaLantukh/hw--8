package linkedList;

public interface LinkedListInterface<E>{
    void add(E value);
    E remove(int index);
    E get ( int index);
    void clear ();
    int size () ;

}
