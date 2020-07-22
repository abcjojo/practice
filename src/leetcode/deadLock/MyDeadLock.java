package leetcode.deadLock;

/**
 * @program: exercise
 * @description: ÊÖĞ´ËÀËø1
 * @author: Jojo.Lee
 * @create: 2019-07-29 11:42
 **/

//²Î¿¼ÍøÖ·   https://blog.csdn.net/qq_34532187/article/details/82901465

class Jarry{

    public void say(){
        System.out.println("JarryËµ£ºbarry£¬ÄãÒªÇëÎÒ³Ô·¹");
    }

    public void eat(){
        System.out.println("BarryÇëJarry³Ô·¹ÁË");
    }
}

class Barry{
    public void say(){
        System.out.println("Barry£ºJarry£¬ÄãÒªÇëÎÒ£¬ÎÒ¾ÍÇëÄã³Ô·¹");
    }

    public void eat(){
        System.out.println("JarryÇëBarry³Ô·¹ÁË");
    }
}

public class MyDeadLock implements Runnable{

    public static Jarry jarry = new Jarry();
    public static Barry barry = new Barry();
    public boolean flag = false;

    @Override
    public void run() {
        if(flag){
            synchronized (jarry){
                jarry.say();
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized(barry){
                    jarry.eat();
                }
            }
        }
        else{
            synchronized(barry){
                barry.say();
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized(jarry){
                    barry.eat();
                }
            }
        }
    }

    public static void main(String[] args) {

        MyDeadLock my1 = new MyDeadLock();
        MyDeadLock my2 = new MyDeadLock();
        my1.flag = true;
        my2.flag = false;
        new Thread(my1).start();
        new Thread(my2).start();

    }
}
