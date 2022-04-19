import java.util.*;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i] + nums[j]) == target)
                {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int x[]= {3,2,4};
        Arrays.stream(twoSum(x,7)).forEach(System.out::println);
    }
}