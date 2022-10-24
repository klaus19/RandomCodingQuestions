import java.util.Arrays;

public class NoSmallerthanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] clo = nums.clone();
        Arrays.sort(clo);

        int[] res = new int[nums.length];
        int i = 0;
        for(int x : nums)
        {
            int idx = binarySearch(clo, 0, nums.length - 1, x);
            res[i++] = idx;
        }
        return res;
    }

    // return left_most index
    private int binarySearch(int[] arr, int s, int e, int find)
    {
        while(s < e)
        {
            int mid = (e - s)/2 + s;
            if(arr[mid] >= find)
                e = mid;
            else
                s = mid + 1;
        }
        return s;
    }
}
