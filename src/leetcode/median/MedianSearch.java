package leetcode.median;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @program: exercise
 * @description: ��д�������������λ��
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
    * @Description:  ˼�룺����С��ʵ�֡��½�һ������Ϊ(n+1)/2����С�ѣ�Ȼ�������ǰn+1λ�������С���У�
     * ������ʣ�µ�����ջ��Ԫ�رȽϣ���Ľ��ѣ�С���ӵ����ж����鳤�ȣ������ҳ���λ����ջ���ĵ�һλ����ǰ��λΪ��λ����
    * @Param:
    * @return:
    * @Author: Jojo.Lee
    * @Date:
    */
    //�ο����ӣ�https://www.cnblogs.com/shizhh/p/5746151.html
    //PriorityQueue  ���ȶ��У�Ĭ��Ϊ��С�ѣ�ָ��comparatorʱĬ��Ϊ����
    public double medianSearchHeap(int [] array){
        int leng = array.length/2+1;
        PriorityQueue<Integer> heap = new PriorityQueue<>(leng);
        //�������ǰһ����������
        for(int i=0;i<leng;i++){
            heap.add(array[i]);
        }
        //���Ѷ�Ԫ��С��ɾ�����������е�Ԫ�ؽ��ѣ���Ļ�ֱ���ӵ���
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
