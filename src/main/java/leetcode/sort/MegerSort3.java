package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: 复习归并排序  归并排序思想：先将数组中的每个元素单拎出来，然后从头开始把
 * 相邻的两个元素排序并合为一组，再将相邻的两组元素从第一个开始进行排序，排完后合为一组，以此递归至结束。
 * 在每次排完序合并之后，将改组元素赋值到新建的同array[]大小相同，下标相同的数组tem[] 中。
 * @author: Jojo.Lee
 * @create: 2019-08-01 15:01
 **/
public class MegerSort3 {

    Integer count=0;

    @Test
    public void test(){
        int leng = 8;
        int [] array = new int [leng];
        for ( int i=0; i<leng; i++) {
            array [i] = (int)(Math.random()*100);
            System.out.print(array[i]+" ");
        }
//        int[] array = { 49, 38, 65, 97, 76, 13, 27, 50 };
        megerSort(array,0,leng-1);
        System.out.println();
        System.out.println("count:"+count);
        System.out.println("排序后：");
        for (int i : array) System.out.print(i+" ");
    }

    //分组，先将数组中的每个元素单拎出来
    public void megerSort(int [] array, int start, int end){
        if (start<end) {
            int mid = (start + end) / 2;
            megerSort(array, start, mid);
            megerSort(array, mid + 1, end);
            meger(array,start,mid,end );
        }
    }

    public void meger(int [] array, int left, int mid, int right){
        int [] tem = new int [array.length];
        int p1 = left;
        int p2 = mid+1;
        //key用来保存存入tem数组中的下标位置
        int key = left;

        while (p1<=mid && p2<=right){
            if(array[p1]<=array[p2]){
                tem[key++] = array[p1++];
            }else{
                tem[key++] = array[p2++];
            }
        }
        while(p1<=mid) tem[key++] = array[p1++];
        while(p2<=right) tem[key++] = array[p2++];

        for(int i=left; i<=right; i++){
            array[i] = tem[i];
        }
        count++;
    }

    //交换数组中下标为p1、p2的元素的值
    public void swap (int [] array, int p1, int p2){
        array [p1] = array [p1] + array [p2];
        array [p2] = array [p1] - array [p2];
        array [p1] = array [p1] - array [p2];
    }

}
