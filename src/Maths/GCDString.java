package Maths;

public class GCDString {
    public String gcdOfStrings(String str1, String str2) {

        for (int i=0;i<str1.length();i++)
            if (!str1.substring(i,i+1).contains(str2))
                return "";

        return str2;
    }
}
