import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedListExample {

    public static void main(String args[]){

        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        System.out.println("\nTraversing the list of elements in reverse order");
        Iterator i=ll.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
