package array;

import java.util.Scanner;

public class reverse_in_range {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int start=s.nextInt();
        int stop=s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        reverse(a,start,stop);
    }

    public static void reverse(int[] a,int start,int stop) {
        int i = start-1;
        int j = stop-1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        for (int x:a) {
            System.out.print(x + " ");
        }
    }
}
