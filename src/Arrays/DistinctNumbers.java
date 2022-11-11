package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctNumbers {

    public int getCountDistinct(int[]nums){
        int count=1;
        Arrays.sort(nums);
        int initial=nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=initial){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        DistinctNumbers dn = new DistinctNumbers();
        int[]arr = new int[]{2,2,3,2,2};
        System.out.println(dn.getCountDistinct(arr));
    }
}
