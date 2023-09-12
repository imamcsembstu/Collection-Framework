import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){

        LinkedList<String> lList=new LinkedList<>();
        lList.add("Ravi");
        lList.add("Vijay");
        lList.add("Ravi");
        lList.add("Ajay");
        lList.add(4,"Sayem");

        Iterator<String> itr=lList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("The LinkedList is: "+lList);

        LinkedList<String> ll2=new LinkedList<>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");
        System.out.println("The 2nd Linked List"+ll2);

        lList.addAll(ll2);

        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+lList);

        LinkedList<String> ll3=new LinkedList<>();
        ll3.add("John");
        ll3.add("Rahul");
        //Adding second list elements to the first list at specific position
        lList.addAll(1, ll3);
        System.out.println("\nAfter invoking addAll(int index, Collection<? extends E> c) method: "+lList);

        lList.addFirst("Lokesh");
        System.out.println("\nAfter invoking addFirst(E e) method: "+lList);
        //Adding an element at the last position
        lList.addLast("Harsh");
        System.out.println("\nAfter invoking addLast(E e) method: "+lList);

        //Removing specific element from arraylist
        lList.remove("Vijay");
        System.out.println("\nGiving Element \"Vijoy\" After invoking remove(object) method: "+lList);
        //Removing element on the basis of specific position
        lList.remove(1);
        System.out.println("\nGiving Index 1,indexAfter invoking remove(index) method:"+lList);

        //Removing all the new elements from arraylist
        lList.removeAll(ll3);
        System.out.println("\nAfter invoking removeAll() method(ll3): "+lList);

        lList.add("Gaurav");
        lList.add("Harsh");
        lList.add("Gaurav");
        lList.add("Harsh");

        //Removing first element from the list
        lList.removeFirst();
        System.out.println("\nAfter invoking removeFirst() method: "+lList);
        //Removing first element from the list
        lList.removeLast();
        System.out.println("\nAfter invoking removeLast() method: "+lList);



        //Removing first occurrence of element from the list
        lList.removeFirstOccurrence("Gaurav");
        System.out.println("\nAfter invoking removeFirstOccurrence() method: "+lList);
        //Removing last occurrence of element from the list
        lList.removeLastOccurrence("Harsh");
        System.out.println("\nAfter invoking removeLastOccurrence() method: "+lList);

    }
}
