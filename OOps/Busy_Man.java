package OOps;

import java.util.*;

public class Busy_Man {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n = s.nextInt();
        pair[] a = new pair[n];
        for (int i = 0; i < a.length; i++) {
            int st = s.nextInt();
            int et = s.nextInt();
            a[i] = new pair(st, et);
        }
        Arrays.sort(a, new Comparator<pair>() {
            @Override
            public int compare(pair o1, pair o2) {
                return o1.et - o2.et;
            }
        });
        int act = 1;
        int end = a[0].et;
        for (int i = 0; i < a.length; i++) {
            if (end <= a[i].st) {
                act++;
                end = a[i].et;
            }
        }
        System.out.println(act);
    }
    }
   static class pair{
        int st;
        int et;
        public pair(int st,int et){
            this.st=st;
            this.et=et;
        }
    }
}
