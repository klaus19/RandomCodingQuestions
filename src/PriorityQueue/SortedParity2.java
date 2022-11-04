package PriorityQueue;


import java.util.Arrays;
import java.util.PriorityQueue;

public class SortedParity2 {

    public int[] sortArrayByParityII(int[] A) {

        int[] out = new int[A.length];

        int even = 0;
        int odd = 1;

        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0 || A[i] == 0){
                out[even] = A[i];
                even = even + 2;
            }
            else{
                out[odd] = A[i];
                odd = odd + 2;
            }
        }

        return out;
    }

    public static void main(String[] args) {
        SortedParity2 sp2 = new SortedParity2();
        int[]arr = new int[]{4,2,5,7};
        System.out.println(Arrays.toString(sp2.sortArrayByParityII(arr)));
    }
}
