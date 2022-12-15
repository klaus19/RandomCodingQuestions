package Strings;

import java.util.*;

public class IgnoreDuplicates {

    public int ignoreDuplicates(int[]array){
        Arrays.sort(array);
       int sum=array[0];
        for (int i = 1; i < array.length; i++) {
            sum  ^= array[i];
        }
     return sum;
    }

    public static void main(String[] args) {
        IgnoreDuplicates ig = new IgnoreDuplicates();
        int[]ar = new int[]{1,2,3,3,4};
        System.out.println(ig.ignoreDuplicates(ar));
    }
}
