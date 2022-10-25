public class EquivalentStrings {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        //  String word1_B = "";
        //String word2_B = "";

        StringBuilder builder1= new StringBuilder("");
        StringBuilder builder2 = new StringBuilder("");


       for (int i=0;i<word1.length;i++){
          // word1_B += word1[i].toCharArray();
           builder1.append(word1[i]);


       }

       for (int j=0;j<word2.length;j++){

           builder2.append(word2[j]);
       }

       if (!builder1.toString().equals(builder2.toString()))
           return false;

       return true;

    }

    public static void main(String[] args) {
        EquivalentStrings eqs = new EquivalentStrings();
        String[]str = new String[]{"ab", "c"};
        String[]st2 = new String[]{"a", "bc"};
        System.out.println(eqs.arrayStringsAreEqual(str,st2));
    }
}
