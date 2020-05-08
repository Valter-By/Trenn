import java.util.Objects;

public class Vector<T> {

    private int size;
    private int sizeDataArray;
    private T[] dataArray;

    private static int START_N = 10;

    private void resize() {
        if (sizeDataArray <= size) {
            sizeDataArray *= 2;
            Object[] newDataArray = new Object[sizeDataArray];            /////////////////
            for (int i = 0; i < size; i++) {
                newDataArray[i] = this.dataArray[i];
            }
            this.dataArray = (T[]) newDataArray;
        }
    }

    public Vector(T first) {
        this.dataArray = (T[]) new Object[START_N];            /////////////////
        this.size = 1;
        this.sizeDataArray = START_N;
    }

//    public Vector() {
//        this.sizeDataArray = START_N;
//        this. size = 0;
//        this.dataArray = null;
//    }

    public void add(T item) {
        resize();
        this.dataArray[size++] = item;
    }

    public int getSize() {
        return this.size;
    }

    public T get(int index) {
        return dataArray[index];
    }

    public void set(int index, T item) {
        dataArray[index] = item;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            this.dataArray[i] = this.dataArray[i + 1];
        }
        size--;
    }

    public void add(int index, T item) {
        resize();
        size++;
        for (int i = size - 1; i > index; i--) {
            this.dataArray[i] = this.dataArray[i - 1];
        }
        this.dataArray[index] = item;
    }

    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = this.dataArray[i];
        }
        return array;
    }

    public void sort() {
        return;
    }

    public void clear() {
        this.size = 0;
    }



}
