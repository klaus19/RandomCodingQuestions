import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class BaseballGame {

    public int calPoints(String[] ops) {
//        int result=0;
//        List<Integer>list = new ArrayList<>();
//        for (String op:operations){
//            if (op.equals("+")){
//                int points = list.get(list.size()-1)+list.get(list.size()-2);
//                result+=points;
//            }else if(op.equals("C")){
//                result -= list.get(list.size()-1);
//                list.remove(list.size()-1);
//            }else if(op.equals("D")) {
//                int points = 2 * list.get(list.size() - 1);
//                result += points;
//                list.add(points);
//            }
//            else {
//                int points = Integer.parseInt(op);
//                result+=points;
//                list.add(points);
//            }
//        }
//        return result;

        int res = 0 ;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i< ops.length;i++){
            if(ops[i].equals("C")){
                st.pop();
            }else if(ops[i].equals("D")){
                int temp = Integer.valueOf(st.pop());
                st.push(temp);
                st.push(temp*2);
            }else if(ops[i].equals("+")){
                int n1 = Integer.valueOf(st.pop());
                int n2 = Integer.valueOf(st.pop());
                st.push(n2);
                st.push(n1);
                st.push(n1+n2);
            }else{
                st.push(Integer.valueOf(ops[i]));
            }
        }
        while(!st.isEmpty()){
            res += st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        BaseballGame bs = new BaseballGame();
        String[]arr = new String[]{"5","2","C","D","+"};
        System.out.println(bs.calPoints(arr));
    }
}
