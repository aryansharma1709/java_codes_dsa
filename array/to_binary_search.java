package array;
import java.util.*;
public class to_binary_search {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int item = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int b = search(a, item);
        System.out.println(b);
    }



    public static int search(int[] a, int item) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == item)
                return mid;
            else if (a[mid] > item)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}




