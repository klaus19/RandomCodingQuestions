package PriorityQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;

public class SortEvenOddIndices {

    public int[] sortEvenOdd(int[] nums) {

        PriorityQueue<Integer>even = new PriorityQueue<>((a,b)->a-b);
        PriorityQueue<Integer>odd = new PriorityQueue<>((a,b)->b-a);

        int len = nums.length;
        for (int i=0;i<len;++i){
            if (i%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }

        for (int i=0;i<len;i++){
            if (i%2==0){
                nums[i]=even.poll();
            }else {
                nums[i]=odd.poll();
            }
        }
       return nums;
    }

    public static void main(String[] args) {
        SortEvenOddIndices svr = new SortEvenOddIndices();
        int[]arr = new int[]{4,1,2,3};
        System.out.println(Arrays.toString(arr));
    }
}
