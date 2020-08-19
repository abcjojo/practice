package designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: exercise
 * @description: 抽象主题类
 * @author: Jojo.Lee
 * @create: 2019-08-20 12:35
 **/
public abstract class Subject {

    private List<Observer> list = new ArrayList<>();
    //添加观察者
    public void attach(Observer observer){
        list.add(observer);
    }
    //删除观察者
    public void detach(Observer observer){
        list.remove(observer);
    }

    //通知
    public void Notify(){
        list.forEach(c->c.updata());
    }

}
