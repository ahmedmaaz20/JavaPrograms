import java.util.HashMap;

public class CharacterCount {

    static void sequence1(String str){
        HashMap<Character,Integer> hm=new HashMap<Character, Integer>();

        char[] chararray1 = str.toCharArray();
        for(char c1: chararray1){
                if(hm.containsKey(c1)){
                    int number = hm.get(c1);
                    hm.put(c1,number+1);
                }
                else{
                    hm.put(c1,1);
                }
        }

        System.out.println("Count of C: "+hm);
    }
    public static void main(String args[]){
            sequence1("abcleosabfc");
    }
}
