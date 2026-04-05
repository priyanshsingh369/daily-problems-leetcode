
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);
        System.out.println("Top element: " + pq.peek());      
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
