import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListExample {
    public static void main(String[] args){
        //Creating a list of fruits
        List<String> list1=new ArrayList<>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        for(String fruit:list1)
            System.out.println(fruit);
        System.out.println("After Sorting the list by Collections.sort(list_obj) method");
        Collections.sort(list1);
        //Traversing list through the for-each loop
        for(String fruit:list1)
            System.out.println(fruit);

        System.out.println("Sorting numbers...");
        //Creating a list of numbers
        List<Integer> list2=new ArrayList<>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        System.out.println("Without Sorting:");
        for(Integer number:list2)
            System.out.print(number+" ");
        System.out.println("\nWith Sorting by Collections.sort(list_obj) method:");
        Collections.sort(list2);
        //Traversing list through the for-each loop
        for(Integer number:list2)
            System.out.println(number+" ");
    }
}
