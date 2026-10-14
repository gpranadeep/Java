import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("Java");
        c.add("Python");
        c.add("C");

        System.out.println(c);
        System.out.println("Contains Java: " + c.contains("Java"));
        System.out.println("Size: " + c.size());

        c.remove("Python");
        System.out.println(c);

        c.clear();
        System.out.println("Is Empty: " + c.isEmpty());
    }
}
