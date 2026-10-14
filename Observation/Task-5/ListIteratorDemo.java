import java.util.*;
class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        ListIterator<Integer> it = list.listIterator();
        System.out.println("Forward Traversal:");
        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);
            if (n == 20) it.set(25);
        }
        System.out.println("After set: " + list);
        it.add(40);
        System.out.println("After add: " + list);
        System.out.println("Next Index: " + it.nextIndex());
        System.out.println("Previous Index: " + it.previousIndex());
        System.out.println("Backward Traversal:");
        while (it.hasPrevious()) System.out.println(it.previous());
        System.out.println("Final List: " + list);
    }
}
