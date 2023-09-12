import java.util.ArrayList;
import java.util.List;

public class GetSetExampleInList {
    public static void main(String args[]){
        //Creating a List
        List<String> list=new ArrayList<>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        System.out.println(list);
        //accessing the element
        System.out.println("Returning 1 index element: "+list.get(1));//it will return the 2nd element, because index starts from 0
        //changing the element

        list.set(1,"Dates");
        System.out.println("After invoke set(1,\"Dates\")");
        //Iterating the List element using for-each loop
        for(String fruit:list)
            System.out.println(fruit);

        // Sort method and other method are also same as Arraylist

    }
}
