import java.util.*;
class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> m = new TreeMap<>();
        m.put(30, "Ram");
        m.put(10, "Ravi");
        m.put(20, "Sita");
        m.put(40, "John");
        System.out.println("SortedMap: " + m);
        System.out.println("First Key: " + m.firstKey());
        System.out.println("Last Key: " + m.lastKey());
        System.out.println("HeadMap: " + m.headMap(30));
        System.out.println("TailMap: " + m.tailMap(20));
        System.out.println("SubMap: " + m.subMap(10, 30));
        System.out.println("Comparator: " + m.comparator());
    }
}
