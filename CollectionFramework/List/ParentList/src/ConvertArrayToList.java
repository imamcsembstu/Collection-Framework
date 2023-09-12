import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        String[] arr={"Java","Python","PHP","C++"};
        System.out.println("Printing Array: "+ Arrays.toString(arr));
        //Converting Array to List
        List<String> l=new ArrayList<>();
        for(String item:arr){
            l.add(item);
        }
        System.out.println("Printing List: "+l);


    }
}
