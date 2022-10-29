public class SmallestIndexEqualValue {

    int curr_small =0;
    int min = Integer.MAX_VALUE;

    public int smallestEqual(int[] nums) {

        for (int i=0;i<nums.length;i++){
            if (i%10==nums[i] && i<min){
                min=i;
            }
            if (min==Integer.MAX_VALUE){
                min=-1;
            }

        }

        return min;
    }

    public static void main(String[] args) {
        SmallestIndexEqualValue sv = new SmallestIndexEqualValue();
        int[]arr = new int[]{0,1,2};
        int[]ar = new int[]{4,3,2,1};
        System.out.println(sv.smallestEqual(ar));
    }
}
