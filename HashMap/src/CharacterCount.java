import java.util.HashMap;

public class CharacterCount {


    static void sequence1(String str){

        HashMap<Character,Integer> hm=new HashMap<Character, Integer>();

        char[] chararray1 = str.toCharArray();
        int count=0;
        for(char c1: chararray1){
                if(hm.containsKey(c1)){

                    int val = hm.get(c1) +1;
                    hm.put(c1,hm.get(c1)+1);
                    if(val==2 && count<2){
                        count++;
                        if(count==2){
                            System.out.println("The second letter with second occurrence is: " + c1);
                        }
                    }

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
