package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: ��д����2
 * @author: Jojo.Lee
 * @create: 2019-08-01 14:27
 **/
public class QuickSort2 {
    public Integer count = 0;
    @Test
    public void test(){
        int leng = 8;
        int [] array = new int[leng];
        for (int i=0; i<leng; i++){
            array [i] = (int) (Math.random()*100);
            System.out.print(array[i]+" ");
        }
        System.out.println("---------");
        quicksort(array,0,leng-1);
        System.out.println("count:"+count);
        System.out.print("�����");
        for (int i : array){
            System.out.print(i+" ");
        }

    }
    /**
    * @Description: ���ź����㷨��Ĭ��ѡ���һ����Ϊ��������һ��ָ��Ӻ���ǰѰ��С�ڻ����������ڶ���ָ���ǰ�����Ҵ��ڻ���������
     * ������������ѭ����ֱ��left>right;����������array[left],Ȼ��ֱ�ݹ�û��������沿�֣����沿�֣�ֱ��������ɡ�
     *
    * @Param:
    * @return:
    * @Author: Jojo.Lee
    * @Date:
    */
    public void quicksort(int [] array, int start, int end){
        if (end<start) return;
        int left = start;
        int right = end;
        int key = array [start];

        while (left < right){
            while( array [right] >= key && left <right){
                right--;
            }
            while (array [left] <=key && left < right){
                left++;
            }
            if (left < right) swap( array, left, right );
        }

        array [start] = array [left];
        array [left] = key;
        count++;
        quicksort(array,start,left-1);
        quicksort(array,left+1,end);

    }

    //�����������±�Ϊp1��p2��Ԫ�ص�ֵ
    public void swap (int [] array, int p1, int p2){
        array [p1] = array [p1] + array [p2];
        array [p2] = array [p1] - array [p2];
        array [p1] = array [p1] - array [p2];
    }

}
