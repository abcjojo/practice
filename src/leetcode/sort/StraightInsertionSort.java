package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: 直接插入排序  思想：从数组的第一位元素开始，和前面的每一个元素进行比较，比较元素前面的数组已经排序好，若第
 * i位元素比第i-1位大，直接break，当比较到j时，j+1>i,且j<i，将第i位插进这里，j+1到i的元素顺序后移；进行下一位元素比较，
 * @author: Jojo.Lee
 * @create: 2019-07-31 11:06
 **/
public class StraightInsertionSort {
    @Test
    public void test(){
//        int leng = 8;
//        int [] array = new int[leng];
//        //数组添加随机数
//        for (int i=0;i<leng;i++) array[i] = (int)(Math.random()*100);
//        for (int i:array)  System.out.print(i+" ");
//        System.out.println();
        int [] array = {18,13,2,17,19,15};
        straightInsertionSort(array);
        //打印输出
        for (int i:array)  System.out.print(i+" ");

    }

    //核心思想，第i位元素与之前的元素比较，小了交换继续比较，大了直接进行下一位元素比较。
    public void straightInsertionSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            for (int j=i+1; j>0; j--){
                if(array[j]>=array[j-1]){
                    break;
                }
                swap(array,j,j-1);
            }
        }
    }
    //将数组中的q、p位置的元素交换
    public int [] swap(int [] array,int p,int q){
        array[p] = array[p] + array[q];
        array[q] = array[p] - array[q];
        array[p] = array[p] - array[q];
        return array;
    }

}
