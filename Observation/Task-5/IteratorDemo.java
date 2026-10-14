import java.util.*;
class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> it = list.iterator();
        System.out.println("Has Next: " + it.hasNext());
        System.out.println("Next: " + it.next());
        it.remove();
        System.out.println("After remove: " + list);
        System.out.println("Remaining elements:");
        it.forEachRemaining(System.out::println);
    }
}
