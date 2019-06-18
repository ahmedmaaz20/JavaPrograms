public class prime {
    public static void main(String args[]) {
        int i;
        int sum=0, j;
        for (j = 1; j < 100; j++)
        {
            int count = 0;
            for (i = 1; i <= j; i++)
            {

                if ((j % i) == 0)
                {
                    count++;
                }

            }

            if (count == 2)
            System.out.println(j);
        }

    }
}
