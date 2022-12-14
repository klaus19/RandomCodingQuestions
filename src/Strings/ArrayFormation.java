package Strings;

public class ArrayFormation {


    public String makeSentence(String[]st){

        String s="";
        String t = s.replace(""," ");

        for (int i=0;i<st.length;i++){
            t+=st[i];
        }
        return t;
    }

    public static void main(String[] args) {
        ArrayFormation arr = new ArrayFormation();

        String[]st = new String[]{"Hello",",","My","dear"};
        System.out.println(arr.makeSentence(st));
    }
}
