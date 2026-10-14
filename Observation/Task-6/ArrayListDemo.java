import java.util.*;
class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(30); a.add(10); a.add(20); a.add(10);
        a.add(1, 15);
        System.out.println("List: " + a);
        System.out.println("Get: " + a.get(2));
        a.set(0, 5);
        System.out.println("After set: " + a);
        System.out.println("Contains 20: " + a.contains(20));
        System.out.println("Size: " + a.size());
        System.out.println("Index of 10: " + a.indexOf(10));
        System.out.println("Last index of 10: " + a.lastIndexOf(10));
        a.remove(Integer.valueOf(10));
        System.out.println("After remove: " + a);
        a.sort(Comparator.naturalOrder());
        System.out.println("Sorted: " + a);
        System.out.println("Empty: " + a.isEmpty());
        a.clear();
        System.out.println("After clear: " + a);
    }
}
