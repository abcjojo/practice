package leetcode.ThreadSum;

import java.util.Random;

/**
 * @program: exercise
 * @description: 多线程数组求和    写法逻辑错误，随机数数组加和结果不对
 * @author: Jojo.Lee
 * @create: 2019-07-26 11:28
 **/

class GetValue{
    int value;
    public GetValue(int value){
        this.value = value;
    }
}
public class MultiThreadArraySum implements Runnable {

    GetValue sum;
    Integer fromInt;
    Integer toInt;
    Integer threadNo;

    public MultiThreadArraySum(GetValue sum, Integer fromInt, Integer toInt,Integer threadNo) {
        this.sum = sum;
        this.fromInt = fromInt;
        this.toInt = toInt;
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        long currentTime = System.currentTimeMillis();
        for(int i=fromInt;i<toInt;i++){
            this.sum.value+=i;
        }
        currentTime = System.currentTimeMillis() - currentTime;
        System.out.println("Thread." + threadNo + " executes sum from " + fromInt + " to " + toInt + " in " + currentTime + " milseconds. Sum is " + sum.value);

    }

    public static void main(String[] args) {

        Integer threads =5;
        Integer [] array;
        int leng = 800;//数组长度
        Integer results=0;

        array = new Integer[leng];
        for(int i=0;i<leng;i++){
            array[i] = (int) Math.random()*2000;
        }

        GetValue result[] = new GetValue[threads];
        for(int i=0;i<threads;i++){
            result [i] = new GetValue(0);
        }

        for(int i=0;i<threads;i++){
            int fromInt = leng*i/threads+1;
            int toInt = leng*(i+1)/threads;
            new Thread(new MultiThreadArraySum(result[i],fromInt,toInt,i)).start();
        }

        try{
            Thread.sleep(200);
            for (int i = 0;i<threads;i++){
                results += result[i].value;
            }
            System.out.println(results);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
