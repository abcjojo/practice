package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: 手写快排2
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
        System.out.print("排序后：");
        for (int i : array){
            System.out.print(i+" ");
        }

    }
    /**
    * @Description: 快排核心算法，默认选择第一个数为基数，第一个指针从后往前寻找小于基数的数，第二个指针从前往后找大于基数的数，
     * 交换两个数，循环，直到left>right;交换基数和array[left],然后分别递归该基数的左面部分，右面部分，直至排序完成。
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

    //交换数组中下标为p1、p2的元素的值
    public void swap (int [] array, int p1, int p2){
        array [p1] = array [p1] + array [p2];
        array [p2] = array [p1] - array [p2];
        array [p1] = array [p1] - array [p2];
    }

}
