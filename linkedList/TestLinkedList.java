package linkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list2 = new MyLinkedList<>();

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        for (int i = 0; i <= 16; i++) {
            myLinkedList.add("Element-" + i);
        }

        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0));
        System.out.println("myLinkedList.get(1) = " + myLinkedList.get(1));

        System.out.println("myLinkedList.get(14) = " + myLinkedList.get(14));
        System.out.println("myLinkedList.remove(9) = " + myLinkedList.remove(9));
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("myLinkedList.get(14) = " + myLinkedList.get(14));

        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
    }
}