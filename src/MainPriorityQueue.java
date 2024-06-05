import java.util.*;
public class MainPriorityQueue {
    public static void main(String[] args){
        //It's A FIFO data structure with higher priority  order
        //can use Collections - /reverseOrder()
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(4.0);
        queue.offer(3.4);
        queue.offer(0.4);
        queue.offer(2.0);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
