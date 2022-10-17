import java.util.Arrays;

public class Anagram {

    public boolean checkAnagram(String s, String t) {

        char[] ch = s.toLowerCase().toCharArray();
        char[] ch2 = t.toLowerCase().toCharArray();
        boolean status = true;

        Arrays.sort(ch);
        Arrays.sort(ch2);

        for (int i = 0; i < ch.length; i++)
            if (ch[i] != ch2[i])
                return !status;

        return status;
    }

    public static void main(String[] args) {
        Anagram ans = new Anagram();
        String s = "pan",t="apn";
        System.out.println(ans.checkAnagram(s,t));
    }
}

