import java.util.LinkedList;
import java.util.ArrayList;
public class ArrayLinkedLists {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        long startTime;
        long elapsedTime;
        long endTime;

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        //LINKED LISTS
        startTime = System.nanoTime();
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        //Get first element in the LinkedLists
        //linkedList.getFirst();
        linkedList.remove(500000);

        System.out.print("LinkedList:\t" + elapsedTime + "ns\n");

        //ARRAY LISTS
        startTime = System.nanoTime();
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        //Get first element in the LinkedLists
//        arrayList.getFirst();
        arrayList.remove(500000);
        System.out.print("ArrayList:\t" + elapsedTime + "ns");
    }
}
