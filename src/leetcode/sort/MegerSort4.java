package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-08 09:47
 **/
public class MegerSort4 {

    public void group(int[] array,int start, int end){
        if (start<end){
            int mid = (start + end)/2;
            group(array,start,mid);
            group(array,mid+1,end);
            meger(array,start,mid,end);
        }
    }

    private void meger(int[] array, int start, int mid, int end) {
        int p1 = start;
        int p2 = mid+1;
        int key = start;
        int [] tmp = new int [array.length];

        while(p1<=mid &&p2<=end){
            if(array[p1]<array[p2]){
                tmp[key++] = array[p1++];
            }else{
                tmp[key++] = array[p2++];
            }
        }
        while (p1<=mid) tmp[key++] = array[p1++];
        while (p2<=end) tmp[key++] = array[p2++];

        for (int i=start; i<=end; i++){
            array[i] = tmp[i];
        }
    }

    @Test
    public void test(){

        RandomArray ra = new RandomArray(6);
        int [] array = ra.generateArray();
        ra.arrayToString(array);
        group(array,0,array.length-1);
        ra.arrayToString(array);

    }

}
