package recursion_monu_bhaiya;
import java.util.*;
public class sudoko_solver {
    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        sudoku(grid,0,0);
    }
    public  static void sudoku(int[][]grid,int row,int col)
    {
        if(col==9)
        {
            col=0;
            row++;
        }
        if(row==9)
        {
            display(grid);
            return;
        }
        if(grid[row][col]!=0)
            sudoku(grid,row,col+1);
        else
        {
            for(int val=0;val<=9;val++)
            {
                if(it_is_safe(grid,col,row,val))
                {
                   grid[row][col]=val;
                   sudoku(grid,row,col+1);
                   grid[row][col]=0;
                }
            }
        }
    }
    public static void display(int[][]grid)
    {
      for(int i=0;i< grid.length;i++)
      {
          for(int j=0;j<grid[0].length;j++)
          {
              System.out.print(grid[i][j]+" ");
          }
          System.out.println();
      }
    }
    public static boolean it_is_safe(int[][]grid,int col,int row,int val)
    {
        for(int i=0;i<grid[0].length;i++)
        {
            if(grid[i][col]==val)
                return false;
        }
        for(int i=0;i<grid.length;i++)
        {
            if(grid[row][i]==val)
                return false;
        }
        int r=row-(row%3);
        int c=col-(col%3);
        for(int i=r;i<r+3;i++)
        {
            for(int j=c;j<c+3;j++)
            {
                if(grid[i][j]==val)
                    return false;
            }
        }
        return true;
    }
}
