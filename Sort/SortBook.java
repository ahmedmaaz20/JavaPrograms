import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBook {

    public static void main(String args[]){

        List<Book2> book2 = new ArrayList<>();
        book2.add(new Book2("Java","Roy",700,1001));
        book2.add(new Book2("C++", "Zee", 900, 1002));
        book2.add(new Book2("Python", "Chris", 750, 1003));

        Comparator<Book2> comp1 = new Comparator<Book2>() {
            @Override
            public int compare(Book2 o1, Book2 o2) {
                return o1.getAuthorName().compareTo(o2.getAuthorName());
            }
        };

        Collections.sort(book2,comp1);
        for(Book2 j: book2){
            System.out.println(j);
        }

    }
}
