import java.util.Arrays;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }

    public static void main(String[] args) {
        MajorityElement ms = new MajorityElement();
        int[]no = new int[]{3,3,4};
        System.out.println(ms.majorityElement(no));
    }
}
