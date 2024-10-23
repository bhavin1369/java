import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<String> queue =new LinkedList<String>();
        queue.add("Ansh");
        queue.add("Bhavin");
        queue.add("viraj");
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue);
    }
}
