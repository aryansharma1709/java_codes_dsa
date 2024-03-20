package Array_striver;
import java.util.*;
public class remove_duplicates_in_sorted_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        }
        int c=remove_duplicacy(nums);
        for(int i=0;i<c;i++)
        System.out.print(nums[i]+" ");
    }
    public static int remove_duplicacy(int []nums)
    {
        int i=1;
        int j=0;
        int b=nums[0];
        while(j<nums.length)
        {
            if(b!=nums[j])
            {
                b=nums[j];
                nums[i]=nums[j];
                i+=1;
            }
            j++;
        }
        return i;
    }

}
