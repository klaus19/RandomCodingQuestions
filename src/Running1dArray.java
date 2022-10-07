import java.util.Arrays;

public class Running1dArray {

    public int[] runningSum(int[] nums) {

        for(int i=1;i<nums.length;i++){
            nums[i] +=nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Running1dArray rd = new Running1dArray();
        int[]no = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(rd.runningSum(no)));
    }
}
