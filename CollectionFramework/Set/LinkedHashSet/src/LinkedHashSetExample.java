import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("Mango");
        lhset.add("Banana");
        lhset.add("Apple");
        lhset.add("Lichy");
        lhset.add("Mango");

        Iterator<String> i=lhset.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println(lhset.remove("Mango"));

        System.out.println(lhset);


        //User defined set are also same AS set

    }
}
