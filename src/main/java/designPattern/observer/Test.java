package designPattern.observer;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-20 12:54
 **/
public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver(subject,"tom"));
        subject.attach(new ConcreteObserver(subject,"alice"));
        subject.attach(new ConcreteObserver(subject,"rose"));

        subject.setSubjectState("play!");
        subject.Notify();
    }
}
