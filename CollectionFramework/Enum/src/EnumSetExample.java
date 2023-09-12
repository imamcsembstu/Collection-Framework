import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class EnumSetExample {
    public static void main(String[] args) {
        Set<days> eSet= EnumSet.of(days.SUNDAY,days.MONDAY);


        Iterator<days> itr= eSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //allOf() and noneOf()
        Set<days> eSet1=EnumSet.allOf(days.class);
        System.out.println("Week Days:"+eSet1);
        Set<days> eSet2 = EnumSet.noneOf(days.class);
        System.out.println("Week Days:"+eSet2);


    }
}
