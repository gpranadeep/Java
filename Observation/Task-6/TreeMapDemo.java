import java.util.*;
class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> m = new TreeMap<>();
        m.put(30, "Ram"); m.put(10, "Ravi");
        m.put(40, "John"); m.put(20, "Sita");
        System.out.println("Map: " + m);
        System.out.println("Get: " + m.get(20));
        System.out.println("First Key: " + m.firstKey());
        System.out.println("Last Key: " + m.lastKey());
        System.out.println("Higher Key: " + m.higherKey(20));
        System.out.println("Lower Key: " + m.lowerKey(30));
        System.out.println("Ceiling Key: " + m.ceilingKey(25));
        System.out.println("Floor Key: " + m.floorKey(25));
        System.out.println("Entries: " + m.entrySet());
        System.out.println("Contains Key: " + m.containsKey(10));
        System.out.println("Contains Value: " + m.containsValue("Ram"));
        m.remove(20);
        System.out.println("After remove: " + m);
    }
}
