import java.util.Arrays;
import java.util.HashMap;

public class RankTransformArray {

    //Given an array of integers arr, replace each element with its rank.

    //the method passes partial test cases
    public int[] arrayRankTransform(int[] arr) {

        int min = arr[0];
        //int[]num = new int[arr.length];
        for (int i=1;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        for (int i=0;i<arr.length;i++){
            arr[i]= arr[i]/min;
        }
        return arr;
    }

    //this passes all the test cases
    public int[] arrayRankTransform1(int[] arr) {

        int len = arr.length;
        if(len == 0)    return new int[0];

        int[] sortedArr = arr.clone();

        Arrays.sort(sortedArr);
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] rankList = new int[len];
        int rank = 1;
        map.put(sortedArr[0], rank);

        //Map the values to ranks.
        for(int i = 1 ; i < len; i++)
            if(sortedArr[i] != sortedArr[i-1])
            {
                rank++;
                map.put(sortedArr[i], rank);
            }

        //Retrive the values for getting ranks in correct order.
        for(int i = 0 ; i < len; i++)
            rankList[i] = map.get(arr[i]);

        return rankList;
    }

    public static void main(String[] args) {
        RankTransformArray rts = new RankTransformArray();
        int[]no = new int[]{40,10,20,30};
        int[]g = new int[]{100,100,100};
        System.out.println(Arrays.toString(rts.arrayRankTransform(no)));
        System.out.println(Arrays.toString(rts.arrayRankTransform(g)));
    }
}
