import java.util.*;
class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.offer(30);
        System.out.println("Queue: " + q);
        System.out.println("Element: " + q.element());
        System.out.println("Peek: " + q.peek());
        System.out.println("Remove: " + q.remove());
        System.out.println("Poll: " + q.poll());
        System.out.println("Queue after removals: " + q);
    }
}
