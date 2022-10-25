import java.util.Arrays;

public class GetSmallestString {

    public String getSmallestString(int n, int k) {

        //n=3, k= 27

        // 1. make a character array of length n

        char[]characters = new char[n];

        //2.Fiil the array with 'a'

        Arrays.fill(characters,'a');
        //Guarantee that at least it's presnt for 1 time

        k -= n;
        for (int i=n-1; i>=0 && k>0; i--) {
            // put values possible
            characters[i] += Math.min(25, k);
            k -= Math.min(25, k);
        }
        // return the string
        return String.valueOf(characters);
    }

}
