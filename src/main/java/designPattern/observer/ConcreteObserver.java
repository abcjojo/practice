package designPattern.observer;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-20 12:47
 **/
public class ConcreteObserver extends Observer {
    private ConcreteSubject subject;
    private String name;
    public ConcreteObserver(ConcreteSubject subject,String name){
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void updata() {
        System.out.println(this.name+" message"+ this.subject.getSubjectState() );
    }
}
