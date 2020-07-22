//package leetcode.stack;
//
//import leetcode.LinkedList.Node;
//
///**
// * @program: exercise
// * @description: ��O1��ʱ�临�Ӷ����ջ�е���Сֵ��˼�룺��ʵ��ջʱ��������ջ��һ��ջ�����������ݣ���һ��ջ��ջ��
// * ������Сֵ��
// * @author: Jojo.Lee
// * @create: 2019-08-11 14:37
// **/
//public class MyStack1 {
//    MyLinkedListStack<Integer> stack;
//    MyLinkedListStack<Integer> minStack;
//
//    public MyStack1(){
//        stack = new MyLinkedListStack<>();
//        minStack = new MyLinkedListStack<>();
//    }
//
//    public void push(int data){
//        stack.push(data);
//        if(minStack.isEmpty()){
//            minStack.push(data);
//        }else{
//            if(data<minStack.peek()){
//                minStack.push(data);
//            }
//        }
//    }
//
//    public int pop(){
//        int data = stack.peek();
//        stack.pop();
//        if (data == minStack.peek()){
//            minStack.pop();
//        }
//        return data;
//    }
//
//    public int min(){
//        if(minStack.isEmpty()){
//            return Integer.MAX_VALUE;
//        }else{
//            return minStack.peek();
//        }
//    }
//}
