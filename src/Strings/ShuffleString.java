package Strings;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for(int i = 0;i<indices.length;i++)
            res[indices[i]] = s.charAt(i);
        return new String(res);
    }

    public static void main(String[] args) {
        ShuffleString sf = new ShuffleString();
        String str = "codeleet";
        int[]arr = new int[]{4,5,6,7,0,2,1,3};
        System.out.println(sf.restoreString(str,arr));
    }
}
