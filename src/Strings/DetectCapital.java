package Strings;

public class DetectCapital {


    public boolean detectCapitalUse(String word) {

        for (int i=1;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i-1)) && Character.isUpperCase(word.charAt(i))) return false;
            if(Character.isLowerCase(word.charAt(i)) && Character.isUpperCase(word.charAt(i-1)) && i > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        DetectCapital dc = new DetectCapital();
        String s = "USa";
        System.out.println(dc.detectCapitalUse(s));
    }
    }
