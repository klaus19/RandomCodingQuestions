package Strings;

public class ZigZagConversion {

    public String convert(String s, int numRows) {

        if(numRows == 1) return s;
        char[] str = s.toCharArray();
        int jump = (numRows - 1) * 2;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < numRows; i++) {
            if(i == 0 || i == numRows - 1) {
                for(int j = i; j < str.length; j += jump) {
                    result.append(str[j]);
                }
            } else {
                for(int j = i, k = jump - i; j < str.length; j += jump, k += jump) {
                    result.append(str[j]);
                    if(k < str.length) result.append(str[k]);
                }
            }
        }
        return result.toString();

    }

}
