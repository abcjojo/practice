package ţ�ͽ�ָoffer�����.ţ�ͽ�ָoffer�����;

import java.util.Stack;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-10-13 16:23
 **/
public class ����min������ջ {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if (min.isEmpty()) min.push(node);
        else if (min.peek()>node) min.push(node);

    }

    public void pop() {
        int data = stack.peek();
        stack.pop();
        if (data==min.peek()) min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        if (min.isEmpty()) return Integer.MIN_VALUE;
        else  return min.peek();
    }
}
