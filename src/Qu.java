public class Qu<T> {

    private List<T> list;
    private int cnt = 0;

    Qu(T elem) {
        list = new List<T>();
        list.offerLast(elem);
        cnt = 1;
    }

    public void put(T elmt) {
        list.offerLast(elmt);
        cnt++;
    }

    public T get() {
        cnt--;
        return list.pollFirst();
    }
}
