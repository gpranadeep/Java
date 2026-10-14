import java.util.*;
class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> m = new LinkedHashMap<>();
        m.put(3, "Ram"); m.put(1, "Ravi"); m.put(2, "Sita");
        System.out.println("Map: " + m);
        System.out.println("Get: " + m.get(1));
        System.out.println("Contains Key: " + m.containsKey(2));
        System.out.println("Keys: " + m.keySet());
        System.out.println("Values: " + m.values());
        System.out.println("Entries: " + m.entrySet());
        m.remove(1);
        System.out.println("After remove: " + m);
    }
}
