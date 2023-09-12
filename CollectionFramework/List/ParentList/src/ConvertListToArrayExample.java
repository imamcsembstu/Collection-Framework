import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArrayExample {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Abir");
        l.add("Jia");
        l.add("Sahed");
        l.add("Monju");

        // Convert List to Array
        String[] arr =  l.toArray(new String[l.size()]);
        System.out.println("Printing Array: "+ Arrays.toString(arr));
        System.out.println("Printing List: "+l);
    }
}

