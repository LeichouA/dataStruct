public interface Queue<E> {

    E dequque() throws Exception;
    void enquque(E e);
    int getSize();
    boolean isEmpty();
}
