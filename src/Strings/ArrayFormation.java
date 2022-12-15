package Strings;

public class ArrayFormation {


    public String makeSentence(String[]st){

        String s="";


        for (int i=0;i<st.length;i++){
            s= s+""+st[i];
        }
        return s;
    }

    public static void main(String[] args) {
        ArrayFormation arr = new ArrayFormation();

        String[]st = new String[]{"Hello",",","My","dear"};
        System.out.println(arr.makeSentence(st));
    }
}
