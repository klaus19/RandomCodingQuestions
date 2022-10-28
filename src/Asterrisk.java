import java.util.Stack;

public class Asterrisk {

    public int getAsterisk(String s) {

        int count = 0;
        Stack<Integer> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*')
                if (st.isEmpty()) {
                    count++;
                }
            if (c == '|') {
                if (st.isEmpty())
                    st.add((int) '|');
                else
                    st.pop();
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Asterrisk arr = new Asterrisk();
        String s = "|$**|***";
        System.out.println(arr.getAsterisk(s));
    }
}
