package array;
import java.util.*;
public class insertion_sort {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            insertionSort(a);
            for (int x : a) {
                System.out.print(x + " ");
            }
        }


        public static void insertionSort(int[] a) {
            for (int i = 0; i < a.length; i++) {
                int temp = a[i];
                int x = i;
                for (int j = i - 1; j >= 0; j--) {
                    if (temp < a[j]) {
                        a[j + 1] = a[j];
                        x = j;
                    }
                }
                a[x] = temp;
            }
        }
    }

//    INSERTION SORT EASY METHOD
//    int j = i - 1;
//    int item = arr[i];
//		while (j >= 0 && arr[j] > item) {
//        arr[j + 1] = arr[j];
//        j--;
//    }
//    arr[j + 1] = item;
