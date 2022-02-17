package myQueue;

public class TestMyQueue {

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        System.out.println("size = " + myQueue.size());
        for (int i = 0; i < 8; i++) {
            myQueue.add(i);
        }
        System.out.println("add = " + myQueue.size());
        System.out.println("peek = " + myQueue.peek());
        System.out.println("remove(3) = " + myQueue.remove(7));
        System.out.println("poll = " + myQueue.poll());
        System.out.println("size = " + myQueue.size());
        myQueue.clear();
        System.out.println("size = " + myQueue.size());
    }
}