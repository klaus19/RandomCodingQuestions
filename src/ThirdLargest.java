import java.util.*;

public class ThirdLargest {


    public int thirdMax(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        if(list.size()<3){
            return list.get(list.size()-1);
        }
        return list.get(list.size()-3);
    }

    public static void main(String[] args) {
        ThirdLargest t = new ThirdLargest();
        int[]arr = new int[]{3,2,1};
        System.out.println(t.thirdMax(arr));
    }
}
