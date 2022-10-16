import java.util.Arrays;
import java.util.HashMap;


public class SortPeople {

    public String[] sortPeople(String[] names, int[] heights) {
        HashMap <Integer,String> map=new HashMap<>();
        for(int i=0; i<names.length ;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] ans=new String[names.length];
        int j=0;
        for(int i=heights.length-1;i>=0;i--){
            ans[j]=map.get(heights[i]);
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        SortPeople sp = new SortPeople();
        int[]st = new int[]{180,165,170};
        String[]str = new String[]{"Mary","John","Emma"};
        System.out.println(Arrays.toString(sp.sortPeople(str,st)));
    }
}
