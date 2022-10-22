import java.util.List;

public class CountConsistentStrings {

    // INput :-allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
    // Output :- 2;
    public int countConsistentStrings(String allowed, String[] words) {

         int count=0;
          for (int i=0;i<words.length;i++){
              if (words[i].contains(allowed))
                  count++;
          }
        return count;

    }

    public static void main(String[] args) {
        CountConsistentStrings cs = new CountConsistentStrings();
        String st= "ab";
        String[]w = new String[]{"ad","bd","aaab","baa","badab"};
        System.out.println(cs.countConsistentStrings(st,w));
    }
}
