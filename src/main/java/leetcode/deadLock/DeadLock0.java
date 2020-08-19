package leetcode.deadLock;

/**
 * @program: exercise
 * @description: 手写死锁
 * @author: Jojo.Lee
 * @create: 2019-07-29 11:15
 **/

// 代码学习地址  https://www.cnblogs.com/java-spring/p/10792062.html
public class DeadLock0 {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        new Thread(new FirstThread(obj1,obj2)).start();
        new Thread(new SecondThread(obj1,obj2)).start();
    }

}
class FirstThread implements Runnable{
    Object obj1;
    Object obj2;

    public FirstThread(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj1){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException  e){
                e.printStackTrace();
            }
            synchronized(obj2){

            }
        }
    }
}
class SecondThread implements Runnable{
    Object obj1;
    Object obj2;

    public SecondThread(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj2){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException  e){
                e.printStackTrace();
            }
            synchronized(obj1){

            }
        }
    }
}