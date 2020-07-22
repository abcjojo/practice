package designPattern.observer;

/**
 * @program: exercise
 * @description: 具体的通知者或观察者，将有关状态存入具体观察者对象
 * @author: Jojo.Lee
 * @create: 2019-08-20 12:44
 **/
public class ConcreteSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
