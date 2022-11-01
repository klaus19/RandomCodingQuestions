package Maths;

import java.util.Arrays;

public class SplittingDigits {

    //2932

    public int minimumSum(int num) {
        int[] arr = new int[4];
        // num is less than 10000

        int i = 0;
        // a variable to traverse through the array to appends digits

        while(num>0)
        {

            arr[i]=num%10;
            // to fetch the last digit

            num=num/10;
            // to remove the last digit

            i++;
        }
        Arrays.sort(arr);
        //sorting the array of digits

        return 10*arr[0]+arr[3]+10*arr[1]+arr[2];
    }

    public static void main(String[] args) {
        SplittingDigits sp = new SplittingDigits();
        int no = 2932;

        System.out.println(sp.minimumSum(no));
    }

}
