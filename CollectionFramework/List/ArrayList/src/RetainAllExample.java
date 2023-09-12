import java.util.ArrayList;
import java.util.Iterator;

public class RetainAllExample {


    public static void main(String[] args){
        ArrayList<String> alist1=new ArrayList<>();
        alist1.add("Ravi");
        alist1.add("Vijay");
        alist1.add("Ajay");
        ArrayList<String> alist2=new ArrayList<>();
        alist2.add("Ravi");
        alist2.add("Hanumat");
        alist2.add("Ajay");

        alist1.retainAll(alist2);

        System.out.println("iterating the elements after retaining the elements of al2");
        Iterator itr=alist1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
