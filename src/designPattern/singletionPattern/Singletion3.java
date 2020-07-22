package designPattern.singletionPattern;

/**
 * @program: exercise
 * @description: �ڲ���   �ڲ��൥��ģʽ��ʹ��classloader���Ƽ����ڲ��࣬����һ���̵߳ģ���������ܣ�Ҳ�����ڶ��̻߳�����ʹ��
 * @author: Jojo.Lee
 * @create: 2019-08-19 12:32
 **/
public class Singletion3 {
    private Singletion3(){}
    private static class People{
        public static Singletion3 sgt = new Singletion3();
    }
    public static Singletion3 getInstance(){
        return People.sgt;
    }
}
