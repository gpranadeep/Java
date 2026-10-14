import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> s = new TreeSet<>();

        s.add(40);
        s.add(10);
        s.add(30);
        s.add(20);

        System.out.println(s);
        System.out.println("First: " + s.first());
        System.out.println("Last: " + s.last());
        System.out.println("HeadSet: " + s.headSet(30));
        System.out.println("TailSet: " + s.tailSet(20));
    }
}
