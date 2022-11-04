package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class LargestNoAfterDigitSwap {
    public int largestInteger(int num) {
        PriorityQueue<Integer> odd = new PriorityQueue<>();
        PriorityQueue<Integer> even = new PriorityQueue<>();
        int dig = num;
        while(num >0){
            int val = num%10;
            if(val%2==0){
                even.add(val);
            }else{
                odd.add(val);
            }
            num = num/10;
        }
        StringBuilder res = new StringBuilder();
        while(dig >0){
            int val = dig%10;
            if(val%2==0){
                res.append(even.remove());
            }else{
                res.append(odd.remove());
            }
            dig = dig/10;
        }
        res.reverse();
        return Integer.parseInt(res.toString());

    }

    public static void main(String[] args) {
        LargestNoAfterDigitSwap lsp = new LargestNoAfterDigitSwap();
        int n = 1234;
        System.out.println(lsp.largestInteger(n));
    }
}
