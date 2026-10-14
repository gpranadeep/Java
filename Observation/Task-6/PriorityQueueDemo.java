import java.util.*;
class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(30); q.offer(10); q.offer(20);
        System.out.println("Queue: " + q);
        System.out.println("Peek: " + q.peek());
        System.out.println("Poll: " + q.poll());
        System.out.println("Contains 20: " + q.contains(20));
        System.out.println("Size: " + q.size());
        q.remove(Integer.valueOf(30));
        System.out.println("After remove: " + q);
    }
}
