import java.util.Arrays;

public class test {

    public static void main(String[] args) {

//        ArrayStack<Integer> arrayStack = new ArrayStack<Integer>();
//
//        for(int i = 0 ; i < 5 ; i ++){
//            arrayStack.push(i);
//            System.out.println(arrayStack);
//        }
//
//        arrayStack.pop();
//        System.out.println(arrayStack);
        String s="(,[,{,),],}";

        ArrayStack<String> arrayStack = null;

        String[] arrays = s.split(",");

        for (String a: arrays){

            arrayStack.push(a);
        }



    }
}
