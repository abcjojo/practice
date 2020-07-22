package ex1;
//利用jdk自带的stack（）实现栈的功能
import java.util.Enumeration;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        MyStack sc = new MyStack();
        sc.test();
    }
     public void test(){
        Stack s = new Stack();

        s.push(100);

        s.push(200);
        s.push("A");
        s.push(100.1f);

        System.out.println(s.peek());//显示栈顶元素，不会删除栈中的元素
        System.out.println(s.pop());//弹出栈顶元素

         System.out.println("-----------------------");

        Enumeration es = s.elements();

        while(es.hasMoreElements()){
            System.out.println(es.nextElement());
        }
        }
}
