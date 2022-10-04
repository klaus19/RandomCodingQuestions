import java.util.Arrays;
import java.util.HashMap;

public class MatchingElements {

    int currentCount=1;
    public void getMatching(int nums[]){


        HashMap<Integer,Integer>hmp = new HashMap<>();

        //setting up map for unique integrs and its count
        for (int i=0;i<nums.length;i++){
            if (hmp.containsKey(nums[i])){
                hmp.put(nums[i],currentCount+1);
            }else {
                hmp.put(nums[i],1);
            }
        }
          System.out.println(currentCount);
    }

    public static void main(String[] args) {
        MatchingElements mt = new MatchingElements();
        int[]st = new int[]{1,2,3,3,4,5};
        mt.getMatching(st);

    }
}
