import java.util.Arrays;

public class SortByFrequency {

    public int[] frequencySort(int[] nums) {

        Arrays.sort(nums);
        int[]arr = new int[nums.length];
        int count = 1;
        int first_occurence = nums[0];
        arr[0] = first_occurence;
        for (int i=1;i<nums.length-1;i++){
            if (nums[i]!=first_occurence){
                arr[i-1] = first_occurence;
            }else if (nums[i]==nums[i+1]){
                count++;
                int temp =
                arr[i+1] = nums[i+1];
            }
        }
        return  arr;
    }

    public static void main(String[] args) {
        SortByFrequency srr = new SortByFrequency();
        int[]arr = new int[]{2,3,1,3,2};
        System.out.println(Arrays.toString(srr.frequencySort(arr)));
    }
}
