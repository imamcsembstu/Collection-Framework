import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
    public class EnumMapUserDefinedClassExample {
        public enum key
        {
            One,Two,Three}
        ;
        public static void main(String[] args) {
            EnumMap<key,Book> map= new EnumMap<>(key.class);
            //Creating Books
            Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
            Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
            Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
            map.put(key.One,b1);
            map.put(key.Two,b2);
            map.put(key.Three,b3);

            for(Map.Entry<key,Book>entry:map.entrySet()){
                Book b=entry.getValue();
                System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);

            }
        }
}
