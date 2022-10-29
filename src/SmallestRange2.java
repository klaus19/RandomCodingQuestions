import java.util.Arrays;

public class SmallestRange2 {

    public int smallestRangeII(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[]arr = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if (nums[i]>k){
                arr[i]=nums[i]-k;
            } else {
                arr[i]=k-nums[i];
            }

        }
        for (int i=0;i<arr.length;i++){
            Arrays.sort(arr);
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        return max-min;
    }

    public static void main(String[] args) {
        SmallestRange2 srt = new SmallestRange2();
        int[]arr = new int[]{1,3,6};
        int[]tv = new int[]{0,10};
        int[]lo=new int[]{1};
        int[]yup=new int[]{2,7,2};
        int n=3;
        int k=2;
        int t=0;
        int s=1;
        System.out.println(srt.smallestRangeII(arr,n));
        System.out.println(srt.smallestRangeII(tv,k));
        System.out.println(srt.smallestRangeII(lo,t));
        System.out.println(srt.smallestRangeII(yup,s));
    }

}
