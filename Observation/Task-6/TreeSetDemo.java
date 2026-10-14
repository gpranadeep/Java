import java.util.*;
class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(30); s.add(10); s.add(40); s.add(20);
        System.out.println("TreeSet: " + s);
        System.out.println("First: " + s.first());
        System.out.println("Last: " + s.last());
        System.out.println("Higher 20: " + s.higher(20));
        System.out.println("Lower 30: " + s.lower(30));
        System.out.println("Ceiling 25: " + s.ceiling(25));
        System.out.println("Floor 25: " + s.floor(25));
        System.out.println("Poll First: " + s.pollFirst());
        System.out.println("Poll Last: " + s.pollLast());
        System.out.println("Final Set: " + s);
    }
}
