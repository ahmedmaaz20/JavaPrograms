public class QuestionSix {
    public static void main(String args[]){
        int c=1; //to count the last word
        String sent = " this is example for string token or delimeter using split method you can split";

        sent=sent.trim();

        for(int i=0;i<sent.length();i++)
        {
            if((sent.charAt(i)+"").equals(" "))
                c++;
        }

        System.out.println("Answer = "+c);
    }
}
