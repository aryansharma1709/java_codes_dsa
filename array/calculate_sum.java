package array;
import java.util.*;
public class calculate_sum {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            long first = sc.nextLong();
            long a[] = new long[(int) first];

            for (int i = 0; i < first; i++)
            {
                a[i] = sc.nextLong();
            }

            long second = sc.nextLong();

            while (second-- > 0) {
                long yay = sc.nextLong();
                long[] temp = new long[(int) first];

                for (int i = 0; i < first; i++) {
                    if (i < yay) {
                        temp[i] = a[i] + a[(int) (first - yay + i)];
                    } else {
                        temp[i] = a[i] + a[(int) (i - yay)];
                    }
                }

                a = temp;
            }

            long sum2 = 0;

            for (int i = 0; i < first; i++) {
                sum2 = (sum2 + a[i]) % 1000000007;
            }

            System.out.println(sum2);
        }

}
