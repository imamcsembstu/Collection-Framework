import java.util.ArrayList;

public class ArrayListWithUserDefinedClassEx {
    public static void main(String[] args){
        //Creating user-defined class objects
        Student s1=new Student(101,"Sonoo",23);
        Student s2=new Student(102,"Ravi",21);
        Student s3=new Student(103,"Hanumat",25);
        //creating arraylist
        ArrayList<Student> aList=new ArrayList<>();
        aList.add(s1);//adding Student class object
        aList.add(s2);
        aList.add(s3);
        //Getting Iterator
        //traversing elements of ArrayList object
        for (Student studentObj : aList) {
            System.out.println(studentObj.rollNo + " " + studentObj.name + " " + studentObj.age);
        }
    }
}
