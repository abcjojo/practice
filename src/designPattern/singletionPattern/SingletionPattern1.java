package designPattern.singletionPattern;

/**
 * @program: exercise
 * @description: �򵥵� ����ģʽ
 * @author: Jojo.Lee
 * @create: 2019-08-19 12:11
 **/
public class SingletionPattern1 {
    public static SingletionPattern1 sp;
    private SingletionPattern1(){}
    public static SingletionPattern1 getIntence(){
        if(sp==null){
            sp = new SingletionPattern1();
        }
        return sp;
    }
}
