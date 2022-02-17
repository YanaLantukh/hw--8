package myStack;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();

        System.out.println("myStack.size() = " + myStack.size());
        for (int i = 0; i < 10; i++) {
            myStack.push("A" + i);
        }
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.remove(7) = " + myStack.remove(7));
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.clear");
        myStack.clear();
        System.out.println("myStack.size() = " + myStack.size());
    }
}
