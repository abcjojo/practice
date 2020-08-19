package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: ֱ�Ӳ�������  ˼�룺������ĵ�һλԪ�ؿ�ʼ����ǰ���ÿһ��Ԫ�ؽ��бȽϣ��Ƚ�Ԫ��ǰ��������Ѿ�����ã�����
 * iλԪ�رȵ�i-1λ��ֱ��break�����Ƚϵ�jʱ��j+1>i,��j<i������iλ������j+1��i��Ԫ��˳����ƣ�������һλԪ�رȽϣ�
 * @author: Jojo.Lee
 * @create: 2019-07-31 11:06
 **/
public class StraightInsertionSort {
    @Test
    public void test(){
//        int leng = 8;
//        int [] array = new int[leng];
//        //������������
//        for (int i=0;i<leng;i++) array[i] = (int)(Math.random()*100);
//        for (int i:array)  System.out.print(i+" ");
//        System.out.println();
        int [] array = {18,13,2,17,19,15};
        straightInsertionSort(array);
        //��ӡ���
        for (int i:array)  System.out.print(i+" ");

    }

    //����˼�룬��iλԪ����֮ǰ��Ԫ�رȽϣ�С�˽��������Ƚϣ�����ֱ�ӽ�����һλԪ�رȽϡ�
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
    //�������е�q��pλ�õ�Ԫ�ؽ���
    public int [] swap(int [] array,int p,int q){
        array[p] = array[p] + array[q];
        array[q] = array[p] - array[q];
        array[p] = array[p] - array[q];
        return array;
    }

}
