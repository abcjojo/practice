package leetcode.queue;

/**
 * @program: exercise
 * @description: 数组实现循环队列
 * @author: Jojo.Lee
 * @create: 2019-08-11 19:02
 **/
public class MyQueueByArray {

    Object [] queue = null;
    //队首下标，删除元素的位置
    int front;
    //对尾下标，插入元素的位置
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
    * @Description: 入队
    * @Param:
    * @return:
    * @Author: Jojo.Lee
    * @Date:
    */
    public boolean enqueue(Object data){
        //判断对列是否满了
        if ((area+1)%queue.length==front){
            return false;
        }
        queue[area] = data;
        area = (area+1)%queue.length;
        return true;
    }

    /**
    * @Description: 出队
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
        System.out.println(q.enqueue("张三"));
        System.out.println(q.enqueue("李斯"));
        System.out.println(q.enqueue("赵五"));
        System.out.println(q.enqueue("王一"));//无法入队列，队列满
        for(int i=0;i<4;i++){
            System.out.println(q.dequeue());
        }
    }
}







