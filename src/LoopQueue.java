public class LoopQueue<E> implements Queue<E>{

    private E[] data;

    private int front;

    private int tail;

    private int size;

    public LoopQueue(int capacity){

        data = (E[])new Object[capacity + 1];
        front = 0;
        tail = 0;
        size=0;
    }

    public boolean isEmpty(){

        if (front==tail){
            return true;
        }
        else
            return false;
    }

    public E dequque() throws Exception {

        if (front==tail){

            throw new Exception("链表为空");
        }

        E ret = data[front];
        data[front] = null;
        front = (front + 1) %data.length;
        size--;

        return ret;
    }

    @Override
    public void enquque(E e) {

        array.addLast(e);
        tail++;
        size++;

    }

    public int getCapacity(){

        return data.length-1;
    }


    public int getSize(){
        return size;
    }
}
