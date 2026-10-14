import java.util.*;
class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(20); l.add(30);
        l.addFirst(10);
        l.addLast(40);
        System.out.println("List: " + l);
        System.out.println("Get: " + l.get(1));
        System.out.println("First: " + l.getFirst());
        System.out.println("Last: " + l.getLast());
        l.remove(1);
        System.out.println("After remove: " + l);
        System.out.println("Remove First: " + l.removeFirst());
        System.out.println("Remove Last: " + l.removeLast());
        l.offer(50);
        l.offer(60);
        System.out.println("Peek: " + l.peek());
        System.out.println("Poll: " + l.poll());
        System.out.println("Final List: " + l);
    }
}
