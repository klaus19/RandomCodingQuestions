import java.util.Arrays;

public class NumbersSmallerThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[]blue = new int[nums.length];
        int count=0;
        int cust = nums[0];
        for (int i=0;i<nums.length;i++){
            if (nums[i]>nums[i]) count++;
            blue[i]=count;
        }
         return blue;
    }

    public static void main(String[] args) {
        NumbersSmallerThanCurrent nk = new NumbersSmallerThanCurrent();
        int[]bb = new int[]{8,1,2,2,3};
        System.out.println(Arrays.toString(nk.smallerNumbersThanCurrent(bb)));
    }

}
