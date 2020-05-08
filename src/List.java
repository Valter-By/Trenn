public class List<T> {

    private static class Node<E> {
        private E value;
        private Node<E> prev;
        private Node<E> next;

        Node(final E value, final Node<E> prev, final Node<E> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size;

    public void offerLast (T elem) {
        final Node<T> newNode = new Node<T>(elem, last, null);
        if (last == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        this.size++;
    }



    public T peekFirst() {
        return first == null ? null : first.value;
    }

    public T pollFirst() {
        if (first == null) {
            return null;
        }
        final Node<T> nodeDel = first;
        first = first.next;
        if (first != null) {
            first.prev = null;
        }
        size--;
        return nodeDel.value;
    }


    public T pollLast() {
        if (last == null) {
            return null;
        }
        final Node<T> nodeDel = last;
        this.last = this.last.prev;
        if (this.last != null) {
            last.next = null;
        }
        size--;
        return nodeDel.value;
    }




}
