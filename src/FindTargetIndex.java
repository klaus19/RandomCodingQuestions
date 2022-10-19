import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndex {

    public List<Integer> targetIndices(int[] nums, int target) {

        Arrays.sort(nums);
        int start=0;

        List<Integer>list = new ArrayList<>();
        for (int i=start;i<nums.length;i++){

            if (nums[i]==target){

                list.add(i);
            }

        }

        return list;
    }

    public static void main(String[] args) {
        FindTargetIndex ft = new FindTargetIndex();
        int[]arr = new int[]{1,2,5,2,3};
        int tar=2;
        System.out.println(ft.targetIndices(arr,tar));
    }
}
