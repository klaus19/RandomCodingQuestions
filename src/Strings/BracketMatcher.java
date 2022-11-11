package Strings;

import java.util.Scanner;
import java.util.Stack;

public class BracketMatcher {

    public static String BracketMatcher(String str) {
        // code goes here
        Stack<Character> st = new Stack<>();

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                st.push('(');
            } else {
                st.push(')');
                if (st.isEmpty()) return "0";
                else
                    st.pop();
            }
        }
        return "" + (st.isEmpty() ? 1 : 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(BracketMatcher(sc.nextLine()));
    }
}