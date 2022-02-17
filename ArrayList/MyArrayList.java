package ArrayList;
import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.StringJoiner;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 8;
    private static final int CUT_RATE = 4;
    private Object[] data;
    private int index;

    public MyArrayList() {
        createMyArrayList();
    }


    private void createMyArrayList() {
        data = new Object[INIT_SIZE];
    }


    public void add(T value) {
        resizeIfNeed();
        data[index] = value;
        index++;
    }


    private void resizeIfNeed() { //если массива не хватает, увеличиваю в 2 раза
        if (index == data.length) {
            int newSize = data.length * 2;
            Object[] newData = new Object[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    public T get(int i) throws ArrayIndexOutOfBoundsException {    //возвращаем по индексу
        //return (T) data[i];
        if(i>=0 && i< index) {
            return (T) data[i];
        }
        else {
            System.out.println("Wrong index");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int size() {
        return index;
    }


    public T remove(int i) {
        if (i >= 0 && i < index) {
            T removeElement = (T) data[i];
            System.arraycopy(data, i + 1, data, i, data.length - 1 - i);
            index--;
            return removeElement;
        } else {
            System.out.println("Wrong index");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void clear() {
        if (index == 0) {
            return;
        }

        createMyArrayList();
        index = 0;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "data=" + Arrays.toString(data) +
                ", index=" + index +
                '}';
    }
}