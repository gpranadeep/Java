import java.util.*;
class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> h = new Hashtable<>();
        h.put(1, "Ravi"); h.put(2, "Sita"); h.put(3, "Ram");
        System.out.println("Hashtable: " + h);
        System.out.println("Get: " + h.get(2));
        System.out.println("Contains Key: " + h.containsKey(1));
        System.out.println("Contains Value: " + h.containsValue("Ram"));
        System.out.println("Size: " + h.size());
        System.out.println("Empty: " + h.isEmpty());
        Enumeration<Integer> keys = h.keys();
        System.out.println("Keys:");
        while (keys.hasMoreElements()) System.out.println(keys.nextElement());
        Enumeration<String> values = h.elements();
        System.out.println("Values:");
        while (values.hasMoreElements()) System.out.println(values.nextElement());
        h.remove(2);
        System.out.println("After remove: " + h);
    }
}
