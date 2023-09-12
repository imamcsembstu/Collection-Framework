import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hSet=new HashSet<>();
        hSet.add("One");
        hSet.add("Two");
        hSet.add("Three");
        hSet.add("Four");
        hSet.add("Five");
        hSet.add("Three");
        hSet.add("Two"); //Ignore Dublicate value
        Iterator<String> i=hSet.iterator();

        System.out.println(hSet);// Auto shorted

        while(i.hasNext())
        {
            System.out.println(i.next());
        }


        hSet.remove("Three");
        System.out.println(hSet);

        HashSet<String> newSet =new HashSet();
        newSet.add("19");
        newSet.add("12");
        newSet.add("Eleven");


        hSet.addAll(newSet);
        System.out.println("After invoke addAll(newSet) method: "+hSet);

        hSet.removeAll(newSet);
        System.out.println("After invoke removeAll(newSet) : "+hSet);

        hSet.clear();
        System.out.println("After invoke clear() : "+hSet);



    }

}

