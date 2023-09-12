import java.sql.SQLOutput;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> hT = new Hashtable<>();
        hT.put(1001, "Onkur");
        hT.put(1002, "Hasan");
        hT.put(1003, "Najmul");
        hT.put(1004, "Mahmud");

        for (Map.Entry m: hT.entrySet()){
            System.out.println("key: "+m.getKey()+"  "+"Values: "+m.getValue());
        }

        hT.remove(1002);
        System.out.println("After remove 1002: " +hT);

        System.out.println(hT.getOrDefault(101, "Not Found"));
        System.out.println(hT.getOrDefault(105, "Not Found"));

        System.out.println("Last HashTableMap: "+hT);

        hT.putIfAbsent(1002,"Vijoy");
        System.out.println("Invoke putIfAbsent(1002, Vijoy) method"+hT);

        hT.putIfAbsent(1001,"Rafi");
        System.out.println("Invoke putIfAbsent(1002, Rafi) method: "+hT);


    }
}
