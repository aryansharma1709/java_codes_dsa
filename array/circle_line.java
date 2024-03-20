package array;
import java.util.*;
public class circle_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        a--;
        b--;
        int des_sum = 0;
        for(int i=a;i<b;i++)
        {
            des_sum += arr[i];
        }
        System.out.println(Math.min(des_sum, sum - des_sum));
    }
}