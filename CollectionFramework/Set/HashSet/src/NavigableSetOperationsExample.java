import java.util.TreeSet;

public class NavigableSetOperationsExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("D");

        System.out.println("Initial Set: " + set);

        System.out.println("\nReverse TreeSet: "+set.descendingSet());

        System.out.println("Head Set: "+set.headSet("C", true));

        System.out.println("SubSet: "+set.subSet("A", false, "E", true));

        System.out.println("TailSet: "+set.tailSet("C", false));

        // perform various SortedSetSet operations.
        System.out.println("Initial Set: "+set);

        System.out.println("Head Set: "+set.headSet("C"));

        System.out.println("SubSet: "+set.subSet("A", "E"));

        System.out.println("TailSet: "+set.tailSet("C"));
    }

}

