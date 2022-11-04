package PriorityQueue;

import java.util.*;

public class SortArrayByParity {

    //Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

    public int[] sortArrayByParity(int[] nums) {


        Deque<Integer>d = new ArrayDeque<>();
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2==0){
                d.addFirst(nums[i]);
            }else{
                d.addLast(nums[i]);
            }
        }
        for (int i=0;i<nums.length;i++){
            nums[i]=d.pollFirst();
        }
        return nums;
    }

    public static void main(String[] args) {
        SortArrayByParity sp = new SortArrayByParity();
        int[] arr = new int[]{3, 2, 1, 4};
        System.out.println(Arrays.toString(sp.sortArrayByParity(arr)));
    }

}