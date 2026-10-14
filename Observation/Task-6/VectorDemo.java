import java.util.*;
class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10); v.add(20); v.add(30);
        v.addElement(40);
        System.out.println("Vector: " + v);
        System.out.println("Get: " + v.get(1));
        v.set(1, 25);
        System.out.println("After set: " + v);
        v.remove(0);
        v.removeElement(Integer.valueOf(40));
        System.out.println("After remove: " + v);
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Contains 30: " + v.contains(30));
    }
}
