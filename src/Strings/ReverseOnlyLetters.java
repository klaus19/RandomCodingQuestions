package Strings;

public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {

        int i=0,j=s.length()-1;
        char[]ch = s.toCharArray();

        while (i<j){
             if (isAlphabet(ch[i])){
                 if (isAlphabet(ch[j])){
                     char temp = ch[i];
                     ch[i++] = ch[j--];
                     ch[j--] = temp;
                 }else {
                     j--;
                 }
             }else {
                 i++;
             }

        }

        return new String(ch);
    }

    private boolean isAlphabet(char c){
        if((c>='A' && c<='Z') || (c>='a' && c<='z'))
            return true;

        return false;
    }

    public static void main(String[] args) {
        ReverseOnlyLetters rol = new ReverseOnlyLetters();
        String str = "st-ty";
        System.out.println(rol.reverseOnlyLetters(str));
    }
}
