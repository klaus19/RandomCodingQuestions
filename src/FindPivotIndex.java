import java.util.Arrays;

public class FindPivotIndex {

    public int pivotIndex(int[]nums){
        int total_sum=0;

        for (int i=0;i<nums.length;i++){
            total_sum += nums[i];
        }
        int left_sum=0;
        for (int i=0;i<nums.length;i++){
            if (i!=0) left_sum+=nums[i-1];
            if (total_sum-left_sum-nums[i]==left_sum){
                return i;
            }
        }
        return -1;
    }

    //Second way
    public int getPivot(int[]nums){
        int right=0;
        for(int i=0;i<nums.length;i++){
            right+=nums[i];
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            right-=nums[i];
            if(left==right) return i;
            left+=nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex fp = new FindPivotIndex();
        int[]no = new int[]{1,7,3,6,5,6};
        System.out.println(fp.pivotIndex(no));
    }
}
