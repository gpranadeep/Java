import java.util.*;
class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "Ravi");
        m.put(2, "Sita");
        m.put(3, "Ram");
        System.out.println("Map: " + m);
        System.out.println("Value of key 2: " + m.get(2));
        System.out.println("Contains key 1: " + m.containsKey(1));
        System.out.println("Contains value Ram: " + m.containsValue("Ram"));
        System.out.println("Keys: " + m.keySet());
        System.out.println("Values: " + m.values());
        System.out.println("Entries: " + m.entrySet());
        System.out.println("Size: " + m.size());
        System.out.println("Empty: " + m.isEmpty());
        m.remove(2);
        System.out.println("After remove: " + m);
        m.clear();
        System.out.println("After clear: " + m);
    }
}
