package offer05;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

/**
 * 解析：入栈操作：全部进入stack1；
 * 出栈操作：当stack1与stack2均为空时，返回队列为空；
 *          当stack2为空，stack1不为空时，stack1全部出栈，stack2入栈操作，返回stack2.pop()
 *          当stack2不为空，stack2进行出栈操作
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    //入栈
    public void push(int node) {
        stack1.push(node);
    }

    //出栈
    public int pop() {
        //当两个栈都为空时，此时队列为空
        if (stack1.empty() && stack2.empty()) {
            throw new RuntimeException("Queue is empty!");
        }
        //当stack2为空，stack1全部出栈，stack2入栈，返回stack2.pop();
        if (stack2.empty()) {
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        //当stack2不为空时，出栈操作
        return stack2.pop();
    }
}