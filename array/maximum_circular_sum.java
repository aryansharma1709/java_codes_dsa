package array;
import java.util.*;
public class maximum_circular_sum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t--> 0)
            {
                int n = sc.nextInt();
                int nums[] = new int[n];
                for (int i = 0; i < n; i++)
                    nums[i] = sc.nextInt();
                int Sum1 = Max(nums);
                int Sum2 = 0;
                for (int i = 0; i < n; i++)
                {
                    Sum2 += nums[i];
                    nums[i] = -1 * nums[i];
                }
                Sum2 += Max(nums);
                System.out.println(Math.max(Sum1,Sum2));
            }
        }
        static int Max(int[] array) {
            int n = array.length;
            int maxSum = Integer.MIN_VALUE;
            int cSum = 0;

            for (int i = 0; i < n; i++) {
                cSum += array[i];
                maxSum = Math.max(maxSum, cSum);
                if (cSum < 0) {
                    cSum = 0;
                }
            }
            return maxSum;
        }
    }

