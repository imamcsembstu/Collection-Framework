import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add(4,"Banana");
        System.out.println(list);


        System.out.println("\nThe size of the array "+list.size());

        System.out.println("\nPrint by Iterator: ");
        Iterator itr;
        itr = list.iterator();
        while (itr.hasNext()) {//check if iterator has the elements
            System.out.println(itr.next());
        }

        System.out.println("\nTraversing list through for-each loop ");
        for (String fruit : list)
            System.out.println(fruit);

        System.out.println("\nFor get() method value 2 means return the 3nd element, because index starts from 0");
        System.out.println("Returning element for list[2]: " + list.get(2));

        //Changing the element for set method
        list.set(3, "Dates");
        System.out.println("\nTraversing update list(set method)through for-each loop ");
        System.out.println("4th element Grapes to change Dates");
        for (String fruit : list)
            System.out.println(fruit);

        list.add(2,"Strawberry");
        System.out.println("\"After invoking add(int index, E element) method: "+list);


        list.remove(0);
        System.out.println("\"After removing 0 position element"+list);

        list.remove("Banana");
        System.out.println("\"After removing \"Banana\":(Only 1st Banana remove)"+list);

        //Creating another arraylist
        ArrayList<String> list2=new ArrayList<>();
        list2.add("Rafi");
        list2.add("Siyam");

        //Adding new elements to 1stList list:
        list.addAll(list2);
        System.out.println("Updated list after invoking addAll() method(list+list2): "+list);

        list.removeAll(list2);
        System.out.println("update list by Removing list2 from list removeAll_method:" +list);

        list.clear();
        System.out.println("After invoking clear() method: "+list);

        Boolean isEmpty = list.isEmpty();
        System.out.println("Is ArrayList Empty: "+isEmpty);




    }
}

