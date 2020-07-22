package leetcode.queue;

/**
 * @program: exercise
 * @description: ����ʵ��ѭ������
 * @author: Jojo.Lee
 * @create: 2019-08-11 19:02
 **/
public class MyQueueByArray {

    Object [] queue = null;
    //�����±꣬ɾ��Ԫ�ص�λ��
    int front;
    //��β�±꣬����Ԫ�ص�λ��
    int area;

    public MyQueueByArray(){
        this(10);
    }

    public MyQueueByArray(int size){
        queue = new Object[size];
        front = 0;
        area = 0;
    }
    /**
    * @Description: ���
    * @Param:
    * @return:
    * @Author: Jojo.Lee
    * @Date:
    */
    public boolean enqueue(Object data){
        //�ж϶����Ƿ�����
        if ((area+1)%queue.length==front){
            return false;
        }
        queue[area] = data;
        area = (area+1)%queue.length;
        return true;
    }

    /**
    * @Description: ����
    * @Param:
    * @return:
    * @Author: Jojo.Lee
    * @Date:
    */
    public Object dequeue(){
        if(area == front){
            return null;
        }
        Object data = queue[front];
        front = (front+1)%queue.length;
        return data;
    }

    public static void main(String[] args) {
        MyQueueByArray q = new MyQueueByArray(4);
        System.out.println(q.enqueue("����"));
        System.out.println(q.enqueue("��˹"));
        System.out.println(q.enqueue("����"));
        System.out.println(q.enqueue("��һ"));//�޷�����У�������
        for(int i=0;i<4;i++){
            System.out.println(q.dequeue());
        }
    }
}







