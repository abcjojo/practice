package leetcode.stack;

import org.junit.Test;

import java.util.Arrays;

/**
 * @program: exercise
 * @description: 数组实现栈
 * @author: Jojo.Lee
 * @create: 2019-08-10 15:58
 **/
public class MyArrayStack <E>{
    Object [] stack = null;
    int size;
    public MyArrayStack(){
        stack = new Object[5];//栈大小默认为10
    }

    public boolean isEnpty(){
        return size==0;
    }
    public E peek(){
        if (isEnpty()){
            return null;
        }
        return(E) stack[size-1];
    }
    public E pop(){
        E e = peek();
        stack[size-1] = null;
        size--;
        return e;
    }
    //扩容，如果leng大于size时，将数组扩容至leng；
    public void capacity(int leng){
        if(leng<size){
            return;
        }
        stack = Arrays.copyOf(stack,leng);
    }
    public E push(E tmp){
        capacity(size+1);
        stack[size] = tmp;
        size++;
        return tmp;
    }
    @Test
    public void test(){
        MyArrayStack<Integer> mas = new MyArrayStack<Integer>();
        mas.push(1);
        mas.push(2);
        mas.push(3);
        mas.push(4);
        mas.push(5);
        System.out.println(mas.peek());
        System.out.println(mas.push(6));
        System.out.println(mas.pop());
    }
}











