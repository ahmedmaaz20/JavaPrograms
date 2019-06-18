import java.math.BigDecimal;

public class QuestionFive {
    public static void main(String args[]){
        BigDecimal b1=new BigDecimal(10000000);
        BigDecimal b2=new BigDecimal(33333333);
        int a=b1.intValue();   //to convert it to integer
        int b=b2.intValue();
        System.out.println("Addition of the two is = "+(a+b));
    }
}
