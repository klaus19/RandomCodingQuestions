package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class LargestNoAtleastTwice {

    public int dominantIndex(int[] nums) {

        //This doesn't pass all ue cases
//        PriorityQueue<Integer>ps = new PriorityQueue<>(Collections.reverseOrder());
//
//        for (int i =0;i<nums.length;i++){
//            ps.add(nums[i]);
//        }
//
//        int a = ps.poll();
//        int b = ps.poll();
//
//        if (a>=2*b)
//             return ps.peek();
//
//        if (a==1 && b==0)
//        return -1;

        int max=0,second=0,maxIndex=0;
        for (int i=0;i<nums.length;i++){
            if(max<nums[i]){
                second=max;
                max=nums[i];
                maxIndex=i;
            }else if(second<nums[i]) second=nums[i];
        }
       return max>=2*second?maxIndex:-1;
    }

    public static void main(String[] args) {
        LargestNoAtleastTwice lsd = new LargestNoAtleastTwice();
        int []arr = new int[]{3,6,1,0};
        int []s = new int[]{1,2,3,4};
        int[]t = new int[]{0,0,0,1};
        System.out.println(lsd.dominantIndex(arr));
        System.out.println(lsd.dominantIndex(s));
        System.out.println(lsd.dominantIndex(t));
    }
}
