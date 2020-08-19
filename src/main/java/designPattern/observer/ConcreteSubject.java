package designPattern.observer;

/**
 * @program: exercise
 * @description: �����֪ͨ�߻�۲��ߣ����й�״̬�������۲��߶���
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
