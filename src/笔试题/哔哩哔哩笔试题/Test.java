package ±  ‘Ã‚.ﬂŸ¡®ﬂŸ¡®±  ‘Ã‚;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-20 19:53
 **/

public class Test {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.empty()){
            System.out.println("empty");
        }
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int data = stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return data;
    }
    public static void main(String[] args) {
        int arr[][] ={{1,2,3},{1,23,34},{124,43,4},{23,4,6}};
        System.out.println(arr.length);
        System.out.println(arr[1].length);
    }

}
