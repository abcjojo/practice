package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee    手写快排3
 * @create: 2019-08-01 17:54
 **/
public class QuickSort3 {
    public static int count;
    @Test
    public void test(){
        Integer leng = 8;
        int [] array = new int [leng];
        for (int i=0; i<leng; i++){
            array [i] = (int)(Math.random()*100);
        }
        //int[] array = {3,45,78,64,52,11,64,55,99,11};
        toString(array);
        System.out.println("排序后 ：");
        quickSort(array,0,array.length-1);
        toString(array);
    }

    public void toString(int [] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void swap(int [] array, int p, int q){
        array [p] = array[p] ^ array[q];
        array [q] = array[p] ^ array[q];
        array [p] = array[p] ^ array[q];
    }

    public void quickSort(int [] array, int start, int end){
        if(end <= start) return;
        int left = start;
        int right = end;
        int key = array[start];
        while (left < right){
            //找到小于key的数
            while (array[right] >= key && right > left)
                right--;
            //找到大于key的数
            while (array[left] <= key && left < right)
                left++;
            //交换俩数的位置
            if (left < right) {
                int temp=array[left];
                array[left]=array[right];
                array[right]=temp;
            }
        }
        array[start] = array[left];
        array[left] = key;
        count++;
        quickSort(array, start, left-1);
        quickSort(array, left+1, end);
    }
}











