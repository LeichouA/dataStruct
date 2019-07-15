public class Array<E> {

    private E[] data;
    private int size;

    public Array(int capacity){

        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array(){

        this(10);
    }

    public int getSize(){

        return size;
    }

    public int getCapacity(){

        int length = data.length;
        return length;
    }

    public void addLast(E e){

        data[size] = e;
        size++;
    }

    public void addFirst(E e){

       add(0,e);
    }

    public void remove(int index){

        if (index<0 ||index>data.length){

            throw new IllegalArgumentException("remove faild,out of index");
        }

        for (int i= index+1;i<size;i++){
            data[i]=data[i+1];
        }
        size--;
    }

    public void add(int index, E e){

        if (size ==data.length){
            throw new IllegalArgumentException("Add faild,Array is full");
        }

        if (index<0||index>size){
            throw new IllegalArgumentException("Add faild,Require index >=0 adn index <=size");
        }

        for (int i= size - 1;i>=index;i--){
            data[i+1] = data [i];
        }

        data[index] = e;
        size++;
    }

    public E get(int index){

        return data[index];
    }

    public void set(int index,E e){

        data[index]=e;

    }
    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size= %d,capacity= %d\n",size,data.length));
        res.append("[");

        for (int i =0; i<size;i++){

            res.append(data[i]);
            if (i !=size -1)
                res.append(",");
        }
        res.append("]");

        return res.toString();
    }
}
