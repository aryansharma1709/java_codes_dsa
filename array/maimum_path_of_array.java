package array;
import java.util.*;
public class maimum_path_of_array {


        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int test = s.nextInt();
            while (test--> 0)
            {
                int n = s.nextInt();
                int m = s.nextInt();
                int[] u = new int[n];
                int[] d = new int[m];
                int i = 0;
                int j = 0;
                int su = 0;
                int sd = 0;
                int r = 0;
                for (int k = 0; k < n; k++)
                {
                    u[k] = s.nextInt();
                }
                for (int k = 0; k < m; k++)
                {
                    d[k] = s.nextInt();
                }
                while (i < n && j < m)
                {
                    if (u[i] < d[j])
                    {
                        su += u[i];
                        i++;
                    }
                    else if (u[i] > d[j])
                    {
                        sd += d[j];
                        j++;
                    }
                    else
                    {
                        r += Math.max(su, sd);
                        su = 0;
                        sd = 0;
                        while (u[i] == d[j] && i < n && j < m)
                        {
                            r += u[i];
                            i++;
                            j++;
                        }
                    }
                }
                while (i < n)
                {
                    su += u[i];
                    i++;
                }
                while (j < m)
                {
                    sd += d[j];
                    j++;
                }
                r += Math.max(su, sd);
                System.out.println(r);
            }
        }
    }

