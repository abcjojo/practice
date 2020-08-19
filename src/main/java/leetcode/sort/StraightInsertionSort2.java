package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: 手写直接插入排序2
 * @author: Jojo.Lee
 * @create: 2019-08-07 21:45
 **/
public class StraightInsertionSort2 {

    @Test
    public void test(){
        int leng = 8;
        int [] array = new int [leng];
        for (int i=0; i<leng; i++) array [i] = (int)(Math.random()*100);
        arrayToString(array);
        straightInsertionSort(array);
        arrayToString(array);
    }

    public void arrayToString(int [] array) {
        for (int i=0; i<array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
    }

    public void straightInsertionSort(int [] array){
        for (int i=0; i<array.length-1; i++){
            for (int j=i+1; j>0; j--){
                if(array[j]>array[j-1]) break;
                int tem = array[j];
                array[j] = array[j-1];
                array[j-1] = tem;
            }
        }
    }

    public void swap(){

    }
}
