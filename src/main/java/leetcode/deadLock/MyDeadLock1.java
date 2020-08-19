package leetcode.deadLock;

/**
 * @program: exercise
 * @description:  ÷–¥À¿À¯
 * @author: Jojo.Lee
 * @create: 2019-07-29 12:59
 **/

class Thread1 implements Runnable{

    Object obj1;
    Object obj2;

    public Thread1(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized(obj1){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            synchronized (obj2){

            }
        }
    }
}

class Thread2 implements Runnable{

    Object obj1;
    Object obj2;

    public Thread2(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized(obj2){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            synchronized(obj1){

            }
        }
    }
}

public class MyDeadLock1 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        new Thread(new Thread1(obj1,obj2)).start();
        new Thread(new Thread2(obj1,obj2)).start();
    }
}
