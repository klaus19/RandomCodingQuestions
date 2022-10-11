import java.util.Arrays;

public class MaximumWordsInSentence {

    public int mostWordsFound(String[] sentences) {

        int max = 1;
        for (int i = 0; i < sentences.length; i++) {
            String[] arr = sentences[i].split(" ");
            max = Math.max(max, arr.length);
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumWordsInSentence mst = new MaximumWordsInSentence();
        String[]str = new String[]{"alice and bob love leetcode", "i think so too",
                "this is great thanks very much"};
        System.out.println(mst.mostWordsFound(str));
    }

    
}
