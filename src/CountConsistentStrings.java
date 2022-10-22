import javax.xml.stream.events.Characters;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountConsistentStrings {

    // INput :-allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
    // Output :- 2;
    public int countConsistentStrings(String allowed, String[] words) {

//         int count=0;
//          for (int i=0;i<words.length;i++){
//              if (words[i].contains(allowed))
//                  count++;
//          }
//        return count;

        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        int count = 0;
        for (String word : words) {
            int flag = 0;
            for (char ch : word.toCharArray()) {
                if (set.contains(ch))
                    flag = 1;
                else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                count += 1;
            }

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
