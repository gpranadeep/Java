import java.util.*;
class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.addFirst(20);
        d.addLast(30);
        d.offerFirst(10);
        d.offerLast(40);
        System.out.println("Deque: " + d);
        System.out.println("First: " + d.peekFirst());
        System.out.println("Last: " + d.peekLast());
        System.out.println("Remove First: " + d.removeFirst());
        System.out.println("Remove Last: " + d.removeLast());
        System.out.println("Poll First: " + d.pollFirst());
        System.out.println("Poll Last: " + d.pollLast());
        System.out.println("Final Deque: " + d);
    }
}
