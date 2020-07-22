package leetcode.queue;

import java.util.Stack;

/**
 * @program: exercise
 * @description: 两个栈实现队列  思想; 两个栈，入队操作与入栈一样，出队时，假设数据保存在栈1中，要将队列的第一个元素出队
 * 即将栈1中的尾部元素出栈，可以吧栈1中的元素都弹到栈2中，直接将栈2的栈顶元素pop即可。
 * @author: Jojo.Lee
 * @create: 2019-08-11 20:44
 **/
public class MyQueueByStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void put(Integer data){
        stack1.push(data);
    }

    public Integer pop(){
        if(stack2==null){
            while(stack1!=null){
                stack2.push(stack1.pop());
            }
        }
         return stack2.pop();
    }
}
