package leetcode.median;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @program: exercise
 * @description: 手写无序数组查找中位数
 * @author: Jojo.Lee
 * @create: 2019-07-31 08:51
 **/
public class MedianSearch {
    @Test
    public void test(){
        int  leng = 8;
        int [] arr = new int[leng];
        for(int i=0;i<leng;i++){
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i]+" ");
        }
        System.out.println("---------");

        System.out.println(medianSearchHeap(arr));
    }

    /**
    * @Description:  思想：用最小堆实现。新建一个长度为(n+1)/2的最小堆，然后将数组的前n+1位数插进最小堆中，
     * 数组中剩下的数与栈顶元素比较，大的进堆，小的扔掉。判断数组长度，即可找出中位数。栈顶的第一位或者前两位为中位数。
    * @Param:
    * @return:
    * @Author: Jojo.Lee
    * @Date:
    */
    //参考链接：https://www.cnblogs.com/shizhh/p/5746151.html
    //PriorityQueue  优先队列，默认为最小堆，指定comparator时默认为最大堆
    public double medianSearchHeap(int [] array){
        int leng = array.length/2+1;
        PriorityQueue<Integer> heap = new PriorityQueue<>(leng);
        //将数组的前一半数赋给堆
        for(int i=0;i<leng;i++){
            heap.add(array[i]);
        }
        //若堆顶元素小则删除，将数组中的元素进堆，大的话直接扔掉。
        for (int i=leng;i<array.length;i++){
            if(heap.peek()<array[i]){
                heap.poll();
                heap.add(array[i]);
            }
        }
        if(array.length%2==1){
            return (double)heap.peek();
        }
        return (double)(heap.poll()+heap.peek())/2.0;
    }
}
