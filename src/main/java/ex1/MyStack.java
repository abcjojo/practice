package ex1;
//����jdk�Դ���stack����ʵ��ջ�Ĺ���
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

        System.out.println(s.peek());//��ʾջ��Ԫ�أ�����ɾ��ջ�е�Ԫ��
        System.out.println(s.pop());//����ջ��Ԫ��

         System.out.println("-----------------------");

        Enumeration es = s.elements();

        while(es.hasMoreElements()){
            System.out.println(es.nextElement());
        }
        }
}
