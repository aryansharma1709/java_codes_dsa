package array;
import java.util.*;
public class array_triplet {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = s.nextInt();
            int t = s.nextInt();
            Arrays.sort(a);
            for (int i = 0; i < n - 2; i++)
            {
                int c = 0;
                int l = i + 1;
                int r = n - 1;
                while (l < r)
                {
                    c = a[i] + a[l] + a[r];
                    if (c == t)
                    {
                        System.out.println(a[i] + ", " + a[l] + " and " + a[r]);
                        l++;
                        r--;
                    }
                    else if (c < t)
                    {
                        l++;
                    }
                    else
                    {
                        r--;
                    }
                }
            }
        }
    }

