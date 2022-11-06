import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static List<List<Integer>> fourSum(int []nums, int target){

        List<List<Integer>> outer=new ArrayList<List<Integer>>();//result container
        Arrays.sort(nums);//sort the array first
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){//if there exists same elment, skip
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){//if there exists same elment, skip
                    continue;
                }
                for(int left=j+1,right=nums.length-1;left<right;){//find the proper elements from start and end
                    //if there exists same elment, skip
                    if(left<right && left>j+1 && right<nums.length-1 && nums[left]==nums[left-1] && nums[right]==nums[right+1]){
                        left++;
                        right--;
                        continue;
                    }
                    if(nums[i]+nums[j]==target-(nums[left]+nums[right])){//if the sum==target, add them to container
                        outer.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }else if(nums[i]+nums[j]<target-(nums[left]+nums[right])){//if smaller than the target, move the left poniter
                        //move the pointer as close as possible within correct condtion
                        while(left<right && nums[i]+nums[j]<target-(nums[left]+nums[right])){
                            left++;
                        }
                    }else if(nums[i]+nums[j]>target-(nums[left]+nums[right])){//if bigger than the target, move the right poniter
                        while(left<right && nums[i]+nums[j]>target-(nums[left]+nums[right])){
                            right--;
                        }
                    }
                }
            }
        }
        return outer;
    }

}
