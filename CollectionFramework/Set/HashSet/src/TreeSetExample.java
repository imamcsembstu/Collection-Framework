import com.sun.source.tree.WhileLoopTree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String>  tSet= new TreeSet<>();
        tSet.add("Rafi");
        tSet.add("Safi");
        tSet.add("Sarif");
        tSet.add("Maruf");
        tSet.add("Tarif");
        tSet.add("Safi");
        tSet.add("Tarif");

        Iterator itr=tSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Traversing element through Iterator in descending order");
        Iterator dItr= tSet.descendingIterator();
        while (dItr.hasNext()) {
            System.out.println(dItr.next());
        }


    }
}
