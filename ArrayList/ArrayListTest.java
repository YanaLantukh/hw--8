package ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        for (int i = 0; i < 8; i++) {
            list.add("Text" + i);
        }

        System.out.println("list = " + list);
        System.out.println("size = " + list.size());
        System.out.println("get(3) = " + list.get(3));
        System.out.println("remove(4) = " + list.remove(4));
        System.out.println("list = " + list);

        list.add("Hello");

        System.out.println("list = " + list);
        System.out.println("size = " + list.size());

        list.clear();
        System.out.println("list.size() = " + list.size());
    }
}