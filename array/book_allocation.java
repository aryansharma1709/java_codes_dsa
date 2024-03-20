package array;
import java.util.*;
public class book_allocation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        while(x-->0) {
            int t = s.nextInt();
            int nos = s.nextInt();
            int[] page = new int[t];
            for (int i = 0; i < t; i++) {
                page[i] = s.nextInt();
            }
            int lo = 0;
            int hi = 0;
            for (int i = 0; i < page.length; i++) {
                hi = hi + page[i];
            }
            int ans = 0;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (is_possible(page, nos, mid)) {
                    ans = mid;
                    hi = mid - 1;
                } else
                    lo = mid + 1;
            }
            System.out.println(ans);
        }

    }
    public static boolean is_possible(int [] page,int nos,int mid)
    {
        int student=1;
        int readpage=0;
        int i=0;
        while(i<page.length)
        {
            if(readpage+page[i] <=mid)
            {
                readpage+=page[i];
                i++;
            }
            else {
                student++;
                readpage=0;
            }
            if(student>nos)
            {
                return false;
            }
        }
        return true;
    }
}

