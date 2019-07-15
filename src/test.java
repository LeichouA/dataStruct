public class test {

    public static void main(String[] args) {
        Array<String > array = new Array<String >();

        array.addLast("hello");
        array.addLast("hshsh");
        array.addLast("ddd");
        array.addLast("ddsaa");
        array.addLast("dddss");


        System.out.println(array.getCapacity());
        System.out.println(array.getSize());
        System.out.println(array.toString());
        array.remove(2);

        System.out.println(array.getCapacity());
        System.out.println(array.getSize());
        System.out.println(array.toString());
    }
}
