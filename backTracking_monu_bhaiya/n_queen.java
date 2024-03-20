package backTracking_monu_bhaiya;
import java.util.*;
public class n_queen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[][] check = new boolean[n][n];
        placed(check, n, 0);
    }

    public static void placed(boolean[][] check, int tq, int row) {
        if (tq == 0) {
            display(check);
            System.out.println();
            return;
        }
        for (int col = 0; col < check[0].length; col++) {
            if (is_it_safe(check, row, col))
            {
                check[row][col] = true;
                placed(check, tq - 1, row + 1);
                check[row][col] = false;
            }
        }
    }

    public static void display(boolean[][] check) {
        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < check[0].length; j++) {
                if (check[i][j])
                    System.out.print("Q");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }

    public static boolean is_it_safe(boolean[][] check, int row, int col) {
        for (int i = row; i >= 0; i--) {
            if (check[i][col])
                return false;
        }
        int j = col;
        int i=row;
       while(i>=0 && j<check[0].length)
       {  if (check[i][j])
                return false;
            i--;
            j++;
        }
        j = col;
       i=row;
       while(i>=0 && j>=0){
                if(check[i][j])
                    return false;
                i--;
                j--;
        }
            return true;
    }
}

