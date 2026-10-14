import java.util.*;
class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.addFirst(20); d.addLast(30);
        d.offerFirst(10); d.offerLast(40);
        System.out.println("Deque: " + d);
        System.out.println("Peek First: " + d.peekFirst());
        System.out.println("Peek Last: " + d.peekLast());
        System.out.println("Poll First: " + d.pollFirst());
        System.out.println("Poll Last: " + d.pollLast());
        System.out.println("Final Deque: " + d);
    }
}
