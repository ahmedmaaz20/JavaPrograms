import java.util.HashMap;

public class WordCount {

    static void word1(String str){
        HashMap<String,Integer> hm=new HashMap<String,Integer>();

        String[] strarray1 = str.split(" ");
        for(String str1:strarray1){
            if(hm.containsKey(str1)){
                int number1 = hm.get(str1);
                hm.put(str1,number1+1);
            }
            else{
                hm.put(str1,1);
            }
        }
        System.out.println("Count of words: " + hm);

    }

    public static void main(String args[]){
            word1("This is sample for Hashmap hello is this for sample like this");
    }
}
