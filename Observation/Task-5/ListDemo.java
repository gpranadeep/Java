import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add(1, "Orange");

        System.out.println(list);
        System.out.println("First Element: " + list.get(0));

        list.set(1, "Mango");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
