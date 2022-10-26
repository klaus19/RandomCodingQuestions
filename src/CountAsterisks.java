import java.util.Stack;

public class CountAsterisks {

    public int countAsterisks(String s) {
        int count=0;
        Stack<Character>st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*'){
                if(st.isEmpty()){
                    count++;
                }
            }

            if(c=='|'){
                if(st.isEmpty())
                    st.add('|');
                else
                    st.pop();
            }

        }
        return count;
    }
}
