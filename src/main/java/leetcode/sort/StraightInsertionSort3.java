package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: ֱ�Ӳ���3
 * @author: Jojo.Lee
 * @create: 2019-08-07 22:38
 **/
public class StraightInsertionSort3 {

    /**
     * ˼�룺��һ��ѭ���������飬����ѭ��j=i+1��ʼ��֮ǰ��Ԫ�����αȽϣ����������;ͽ�����ֱ��i+1֮ǰ��
     * ����Ԫ���������
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
