package designPattern.singletionPattern;

/**
 * @program: exercise
 * @description: 内部类   内部类单子模式，使用classloader机制加载内部类，他是一个线程的，提高了性能，也可以在多线程环境中使用
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
