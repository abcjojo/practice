package designPattern.singletionPattern;

/**
 * @program: exercise
 * @description: 多线程中的单子模式
 * @author: Jojo.Lee
 * @create: 2019-08-19 12:27
 **/
public class Singletion2 {
    private static Singletion2 sgt;
    private Singletion2(){}
    public static synchronized Singletion2 getInstace(){
        if (sgt==null){
            sgt = new Singletion2();
        }
        return sgt;
    }
}
