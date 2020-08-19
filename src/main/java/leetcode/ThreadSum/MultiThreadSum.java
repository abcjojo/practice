package leetcode.ThreadSum;

import java.util.Map;

/**
 * @program: exercise
 * @description: 多线程求和
 * @author: Jojo.Lee
 * @create: 2019-07-26 10:26
 **/

class MutableInteger{
    Integer value;
    public MutableInteger(Integer value){
        this.value = value;
    }
}

public class MultiThreadSum implements Runnable{

    MutableInteger sum;
    Integer fromInt;
    Integer toInt;
    Integer threadNo;

    public MultiThreadSum(MutableInteger sum, Integer fromInt, Integer toInt, Integer threadNo) {
        this.sum = sum;
        this.fromInt = fromInt;
        this.toInt = toInt;
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        long currentTime = System.currentTimeMillis();
        for(int i=fromInt;i<=toInt;i++){
            this.sum.value +=i;
        }
        long cuttentTime = System.currentTimeMillis()-currentTime;
        System.out.println("Thread." + threadNo + " executes sum from " + fromInt + " to " + toInt + " in " + currentTime + " milseconds. Sum is " + sum.value);
    }

    public static void main(String[] args) {
        Integer toMax = 2000;
        Integer threads = 8;
        Integer sunInteger = 0;

        MutableInteger[] subSum = new MutableInteger[threads];
        for (int i = 0; i < threads; i++) {
            subSum[i] = new MutableInteger(0);
        }

        for(int i=0;i<threads;i++){
            int fromInt = toMax*i/threads+1;
            int toInt = toMax*(i+1)/threads+1;
            new Thread(new MultiThreadSum(subSum[i],fromInt,toInt,i)).start();
        }
        try{
            Thread.sleep(200);
            for (int i=0;i<threads;i++){
                sunInteger += subSum[i].value;
            }
            System.out.println(sunInteger);

        }catch (Exception E){
            E.printStackTrace();
        }

    }
}
