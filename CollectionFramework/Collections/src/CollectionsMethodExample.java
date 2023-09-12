import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethodExample {
    public static void main(String[] args) {
        List<String> collectionList=new ArrayList<>();
        collectionList.add("C");
        collectionList.add("C++");
        collectionList.add("Java");
        collectionList.add("C#");
        System.out.println("Initial value of the list is:  "+collectionList);

        Collections.addAll(collectionList,"Python",".net");
        System.out.println("Update list to invoke addAll() method: "+collectionList);

        List<Integer> cList=new ArrayList<>();

        cList.add(2);
        cList.add(4);
        cList.add(8);
        cList.add(16);
        cList.add(3);
        cList.add(-3);//sort count sort for "-" value

        System.out.println("The maximum value: "+Collections.max(cList));

        System.out.println("The maximum value: "+Collections.min(cList));

        Collections.sort(collectionList);
        System.out.println("Sort The StringList : "+collectionList);

        Collections.sort(collectionList,Collections.reverseOrder());
        System.out.println("Sort The StringList as reverseOrder : "+collectionList);

        System.out.println("The Initial List : "+cList);

        Collections.sort(collectionList);
        System.out.println("Sort The IntegerList : "+cList);

        Collections.sort(cList,Collections.reverseOrder());
        System.out.println("Sort The StringList as reverseOrder : "+cList);






    }

}
