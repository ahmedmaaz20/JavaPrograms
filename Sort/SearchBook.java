package Sort;

import java.util.*;

public class SearchBook {
    public static void main(String args[]){
        List<Book2> book2 = new ArrayList<>();
        book2.add(new Book2("Java","Roy",700,1001));
        book2.add(new Book2("C++", "Zee", 900, 1002));
        book2.add(new Book2("Python", "Chris", 750, 1003));

        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("Java", "Roy");
        hm.put("C++", "Zee");
        hm.put("Python", "Chris");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter key: ");
        String key1 = s.nextLine();

        boolean check1 =  hm.containsKey(key1);
        if(check1==true){
            System.out.println("Answer: " + hm.get(key1) );
        }
        else{
            System.out.println("Try a different key");
        }

    }
}
