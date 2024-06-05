import javax.swing.text.Style;
import java.util.*;
public class MainLinkedList {
    public static void main(String[] args){
        // - LinkedList can either be singly or Doubly LinkedLists
        //Singly
        // ['Element','Address'] -> ['Element','Address'] -> ['Element','Address']
        //Doubly
        // ['Previous Address','Element','Next Address'] <-> ['Previous Address','Element','Next Address']
        
        //Example Use cases:

        // - Music Playlists
        //GPS Navigation

        //LinkedList can be treated as Stack or a Queue
        LinkedList<String> linkedList = getStringLinkedList();
        //Removing the same index
        linkedList.remove(4);

        //Searching
        System.out.println(linkedList.indexOf("F"));
        // Using Peek
        System.out.println(linkedList.peekLast()); //last
        System.out.println(linkedList.peekFirst()); //first
         linkedList.addFirst("0"); // will be added to before first Element
        linkedList.addLast("0"); // will be added to after last Element



        System.out.println(linkedList);


    }

    private static LinkedList<String> getStringLinkedList() {
        LinkedList<String> linkedList = getStrings();

        //Assuming I want to add a node in the 4th index
        linkedList.add(4,"E");
        return linkedList;
    }

    private static LinkedList<String> getStrings() {
        LinkedList<String> linkedList = new LinkedList<>();
        // Treating as Stack
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//
//        linkedList.pop();
        //Treating as Queues
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        return linkedList;
    }
}
