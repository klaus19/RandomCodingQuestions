package Strings;

public class LongestPallindromicSubstring {

    public String longestPalindrome(String s) {
        int n = s.length(), start = 0, end = 0;
        boolean[][] dp = new boolean[n][n];

        for (int len=0; len<n; len++) {
            for (int i=0; i+len<n; i++) {
                dp[i][i+len] = s.charAt(i) == s.charAt(i+len) && (len < 2 || dp[i+1][i+len-1]);
                if (dp[i][i+len] && len > end - start) {
                    start = i;
                    end = i + len;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        LongestPallindromicSubstring lpd = new LongestPallindromicSubstring();
        String str = "abdbd";
        System.out.println(lpd.longestPalindrome(str));
    }
}


