import java.util.Queue;
import java.util.LinkedList;
public class MainQueue {
    public static void main(String[] args){
    //FIFO first in, first out
    // add - enqueue / offer()
    // remove - dequeue / poll()
        Queue<String> queue = new LinkedList<String>();

        //add
        queue.add("Karen");
        queue.add("Chad");
        queue.add("Peter");
        queue.add("Harvod");

        //peek
    // System.out.print(queue.peek());

        // poll
        queue.poll();
        queue.poll();

        System.out.print(queue);
    }
}
