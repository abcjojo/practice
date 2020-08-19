package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: ÷±Ω”≤Â»Î4
 * @author: Jojo.Lee
 * @create: 2019-08-08 09:31
 **/
public class StraightInsertionSort4 {

    @Test
    public void test(){
        RandomArray ra = new RandomArray(8);
        int [] array = ra.generateArray();
        ra.arrayToString(array);
        sis(array);
        ra.arrayToString(array);
    }

    public void sis(int [] array){

        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(array[j] > array[j-1]){
                    break;
                }
                int tmp = array[j];
                array[j] = array[j-1];
                array[j-1] = tmp;
            }
        }
    }

}
