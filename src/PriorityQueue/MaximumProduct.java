package PriorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumProduct {

    public int maxProduct(int[] nums) {

        PriorityQueue<Integer>ps = new PriorityQueue<>(Collections.reverseOrder());
        int maxProduct=0;

        for (int i=0;i<nums.length;i++){
            ps.add(nums[i]);
        }

        int a = ps.poll();
        int b = ps.poll();

        return maxProduct = (a-1)*(b-1);
    }

    public static void main(String[] args) {
        MaximumProduct ms = new MaximumProduct();
        int []arr = new int[]{3,4,5,2};
        System.out.println(ms.maxProduct(arr));
    }

}
