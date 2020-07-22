package designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: exercise
 * @description: ����������
 * @author: Jojo.Lee
 * @create: 2019-08-20 12:35
 **/
public abstract class Subject {

    private List<Observer> list = new ArrayList<>();
    //��ӹ۲���
    public void attach(Observer observer){
        list.add(observer);
    }
    //ɾ���۲���
    public void detach(Observer observer){
        list.remove(observer);
    }

    //֪ͨ
    public void Notify(){
        list.forEach(c->c.updata());
    }

}
