//package leetcode.stack;
//
//import leetcode.LinkedList.Node;
//
///**
// * @program: exercise
// * @description: 用O1的时间复杂度求出栈中的最小值，思想：在实现栈时候用两个栈，一个栈正常保存数据，另一个栈中栈顶
// * 保存最小值，
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
