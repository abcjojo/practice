package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: 直接插入3
 * @author: Jojo.Lee
 * @create: 2019-08-07 22:38
 **/
public class StraightInsertionSort3 {

    /**
     * 思想：第一层循环遍历数组，二层循环j=i+1开始与之前的元素依次比较，满足条件就就交换，直至i+1之前的
     * 所有元素排序完毕
     * @param array
     */
    public void sIS(int [] array){
        for (int i=0; i<array.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(array[j]>array[j-1]) break;
                int tem = array[j];
                array[j] = array[j-1];
                array[j-1] = tem;
            }
        }
    }
    @Test
    public void test(){
        int leng = 8;
        int [] array = new int [leng];
        for (int i=0; i<leng; i++) array [i] = (int)(Math.random()*100);
        arrayToString(array);
        sIS(array);
        arrayToString(array);
    }

    public void arrayToString(int [] array) {
        for (int i=0; i<array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
    }

}
