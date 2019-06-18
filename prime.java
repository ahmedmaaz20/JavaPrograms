public class prime {
    public static void main(String args[]) {
        int i, count = 0;
        int sum=0, j;
        for (j = 1; j < 5; j++) {
            for (i = 1; i <= j; i++) {
                if ((j % i) == 0) {
                    count++;
                }
            }

            if (count == 2) {
                sum = sum + j;
            }
        }
        System.out.println(sum);
    }
}
