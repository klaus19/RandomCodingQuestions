import java.util.*;

public class RemoveAnagrams {

    public List<String> removeAnagrams(String[] words) {

        List<String> result = new LinkedList<>();
        String lastAnagramStr = null;
        for (String s : words) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String curAnagramStr = new String(charArr);

            if (curAnagramStr.equals(lastAnagramStr)) {
                continue;
            }
            else {
                lastAnagramStr = curAnagramStr;
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RemoveAnagrams rg = new RemoveAnagrams();
        String[]str = new String[]{"abba","baba","bbaa","cd","cd"};
        System.out.println(rg.removeAnagrams(str));
    }
}
