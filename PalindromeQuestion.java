public class PalindromeQuestion {
    public static void main(String args[]){
        int n,i,sum=0,pal;

        n = 232;
        pal = n;

        while(n>0){
            i = n%10;
            sum = sum*10 + i;
            n = n/10;
        }

        if(pal==sum){
            System.out.println("This is a Palindrome");
        }
        else{
            System.out.println("This is not a Palindrome");
        }
    }
}
