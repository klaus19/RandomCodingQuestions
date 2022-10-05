public class MaximumSubArray {

    public int maxSubArray(int nums[]){
        int curr_sum=nums[0];
        int max_sum=nums[0];

        //
        for (int i=1;i<nums.length;i++){
            int num = nums[i];
            curr_sum = Math.max(curr_sum,curr_sum+num);
            max_sum = Math.max(max_sum,curr_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        MaximumSubArray mx = new MaximumSubArray();
        int []arr = new int[]{1,-3,4,-1};
        System.out.println(mx.maxSubArray(arr));
    }
}
