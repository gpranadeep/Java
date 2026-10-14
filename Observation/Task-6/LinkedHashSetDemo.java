import java.util.*;
class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        s.add(30); s.add(10); s.add(20); s.add(10);
        System.out.println("Set: " + s);
        System.out.println("Contains 10: " + s.contains(10));
        System.out.println("Size: " + s.size());
        s.remove(10);
        System.out.println("After remove: " + s);
        s.clear();
        System.out.println("After clear: " + s);
    }
}
