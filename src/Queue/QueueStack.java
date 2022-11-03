package Queue;

import java.util.Stack;

public class QueueStack {

    //Implement Queue using Stacks
    Stack<Integer>s1;
    Stack<Integer>s2;

    public QueueStack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }


    public void push(int x) {
       while (!s1.isEmpty()){
           s2.add(s1.pop());
       }
       s1.add(x);
       while (!s2.isEmpty()){
           s1.add(s2.pop());
       }
    }

    public int pop() {
         return s1.pop();
    }

    public int peek() {
        if (!s1.isEmpty())
            return s1.peek();
            return -1;
    }

    public boolean empty() {
          return s1.isEmpty();
    }
}
