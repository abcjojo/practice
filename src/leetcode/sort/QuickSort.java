package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: 手写快排   选第一个数为基准值
 * @author: Jojo.Lee
 * @create: 2019-08-01 09:39
 **/
public class QuickSort {

    Integer count=0;

    @Test
    public void test(){
        int leng = 10;
        //int [] array = new int[leng];
//        for(int i=0; i<leng; i++){
//            array[i] = (int)(Math.random()*100);
//            System.out.print(array[i] + " ");
//        }
        int[] array = {3,45,78,64,52,11,64,55,99,11};
        quickSort(array,0,leng-1);
        System.out.println("---------");
        for (int i : array){
            System.out.print(i+" ");
        }
    }

    public void swap(int[] array, int p, int q){
        array[p] = array[p] + array[q];
        array[q] = array[p] - array[q];
        array[p] = array[p] - array[q];
    }

    public void quickSort(int[] array, int left, int right){
        if (left>=right) return;
        int start = left;
        int end = right;
        int key = array[left];

        while (start<end){
            //从右往左找比key小的数
            while(array[end]>=key && start<end){
                end--;
            }
            //从左往右找比key大的数
            while (array[start]<=key && start<end){
                start++;
            }
            if (start<end) {
                int temp=array[start];
                array[start]=array[end];
                array[end]=temp;
            }
        }

        count++;
        array[left] = array[start];
        array[start] = key;
        quickSort(array,left,start-1);
        quickSort(array,start+1,right);
    }
}
