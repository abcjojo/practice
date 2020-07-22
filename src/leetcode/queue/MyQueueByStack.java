package leetcode.queue;

import java.util.Stack;

/**
 * @program: exercise
 * @description: ����ջʵ�ֶ���  ˼��; ����ջ����Ӳ�������ջһ��������ʱ���������ݱ�����ջ1�У�Ҫ�����еĵ�һ��Ԫ�س���
 * ����ջ1�е�β��Ԫ�س�ջ�����԰�ջ1�е�Ԫ�ض�����ջ2�У�ֱ�ӽ�ջ2��ջ��Ԫ��pop���ɡ�
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
