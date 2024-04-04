package stack;
import java.util.*;
public class find_the_celebrity {
//    indian idol algorithm (elemination algorithm) stack problems
    public static void main(String[] args) {
        int [][] graph={{0,1,1,1},{1,0,1,1},{0,0,0,0},{1,1,1,0}};
         System.out.println(celebrity(graph));
    }
    public static int celebrity(int [] []graph){
     Stack<Integer> st= new Stack<>();
     for(int i=0;i<graph.length;i++)
     {
         st.push(i);
     }
     while(st.size()>1)
     {
         int a=st.pop();
         int b=st.pop();
         if(graph[a][b]==1){
             st.push(b);
         }
         else{
             st.push(a);
         }
     }
     int candidate=st.pop();
     for(int i=0;i< graph.length;i++)
     {
         if(i==candidate)
             continue;
         if(graph[candidate][i]==1 || graph[i][candidate]==0)
         {
             return-1;
         }
     }
     return candidate;
    }
}
