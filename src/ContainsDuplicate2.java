import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

    //Given an integer array nums and an integer k, return true if
    // there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 cd2 = new ContainsDuplicate2();
        int[]arr = new int[]{1,2,3,1};
        int k=3;
        System.out.println(cd2.containsNearbyDuplicate(arr,k));
    }
}
