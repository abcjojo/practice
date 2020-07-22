package leetcode.deadLock;

/**
 * @program: exercise
 * @description:  ÷–¥À¿À¯2
 * @author: Jojo.Lee
 * @create: 2019-08-08 18:09
 **/
public class DeadLock2 {

    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        new Thread(new FirstThread2(object1,object2)).start();
        new Thread(new SecondThread2(object1,object2)).start();
    }

}
class FirstThread2 implements Runnable{

    Object object1;
    Object object2;
    public FirstThread2(Object object1,Object object2){
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        synchronized(object1){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (object2){}
        }
    }
}

class SecondThread2 implements Runnable {

    Object object1;
    Object object2;
    public SecondThread2(Object object1,Object object2){
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        synchronized(object2){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            synchronized(object1){}
        }
    }
}