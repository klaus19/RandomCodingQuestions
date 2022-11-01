package Maths;

public class GoodPairs {

    public int numIdenticalPairs(int[] nums) {

        int ans = 0;
        int[] temp = new int[101];

        for (int i = 0; i < nums.length; i++) {
            ans += temp[nums[i]]++;
        }
        return ans;

    }

    public static void main(String[] args) {
        GoodPairs gp = new GoodPairs();
        int[]no = new int[]{1,2,3,1,1,3};
        System.out.println(gp.numIdenticalPairs(no));
    }
}
