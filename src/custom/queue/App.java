package custom.queue;

/**
 * Created by Arjun on 10-Sep-17.
 */
public class App {

    public static void main(String[] args) {
        IQueue<String> queue = new QueueLinkedListImpl<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Size of queue : "+queue.size());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println("Size of queue : "+queue.size());

        queue.add("Z");

        System.out.println("Peek value : "+queue.peek());


    }
}
