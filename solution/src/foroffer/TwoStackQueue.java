package foroffer;

import java.util.Stack;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/27 23:10
 */
public class TwoStackQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()){
            while (!stack1.empty()){
                int i = stack1.pop();
                stack2.push(i);
            }

        }
        return stack2.pop();
    }
}
