package leetcode.ThreadSum;

/**
 * @program: exercise
 * @description: 手写多线程数组求和2
 * @author: Jojo.Lee
 * @create: 2019-07-29 09:03
 **/

class GetValue2{

    int value;
    public GetValue2(int value){
        this.value = value;
    }

}

public class MultiThreadArraySum2 implements Runnable{

    Integer fromInt;
    Integer toInt;
    Integer threadNo;
    GetValue2 getValue;
    Integer[] array;

    public MultiThreadArraySum2(Integer fromInt, Integer toInt, Integer threadNo, GetValue2 getValue, Integer[] array) {
        this.fromInt = fromInt;
        this.toInt = toInt;
        this.threadNo = threadNo;
        this.getValue = getValue;
        this.array = array;
    }

    @Override
    public void run() {
        long currentTime = System.currentTimeMillis();
        int start = fromInt-1;
        int end = toInt;
        while(start<end){
            this.getValue.value +=array[start];
            start++;
        }
        currentTime = System.currentTimeMillis() - currentTime;
        System.out.println("Thread." + threadNo + " executes sum from " + fromInt + " to " + toInt + " in " + currentTime + " milseconds. Sum is " + this.getValue.value);
    }

    public static void main(String[] args) {

        Integer threads = 8;
        Integer leng = 200;
        Integer[] array = new Integer[leng];
        Integer sum = 0;//保存最終結果

        //给数组的每个元素附一个随机数
        for(int i=0;i<leng;i++){
            //括号一定要将Math.random()*1000括起来
            array[i] = (int)(Math.random()*1000);
        }

        GetValue2 result [] = new GetValue2[threads];
        for(int i=0;i<threads;i++){
            result[i] = new GetValue2(0);
        }
        for(int i=0;i<threads;i++){
            int start = leng*i/threads+1;
            int end = leng*(i+1)/threads;
            new Thread(new MultiThreadArraySum2(start,end,i,result[i],array)).start();
        }
        try{
            Thread.sleep(200);
            for(int i=0;i<threads;i++){
                sum +=result[i].value;
            }
            System.out.println(sum);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
