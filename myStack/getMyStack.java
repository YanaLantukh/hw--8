package myStack;

public interface getMyStack<E> {
   void push (E value);
   E remove (int index);
   void clear();
   int size();
   E peek();
   E pop();
}
