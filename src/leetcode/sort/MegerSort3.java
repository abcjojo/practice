package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: ��ϰ�鲢����  �鲢����˼�룺�Ƚ������е�ÿ��Ԫ�ص��������Ȼ���ͷ��ʼ��
 * ���ڵ�����Ԫ�����򲢺�Ϊһ�飬�ٽ����ڵ�����Ԫ�شӵ�һ����ʼ��������������Ϊһ�飬�Դ˵ݹ���������
 * ��ÿ��������ϲ�֮�󣬽�����Ԫ�ظ�ֵ���½���ͬarray[]��С��ͬ���±���ͬ������tem[] �С�
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
        System.out.println("�����");
        for (int i : array) System.out.print(i+" ");
    }

    //���飬�Ƚ������е�ÿ��Ԫ�ص������
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
        //key�����������tem�����е��±�λ��
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

    //�����������±�Ϊp1��p2��Ԫ�ص�ֵ
    public void swap (int [] array, int p1, int p2){
        array [p1] = array [p1] + array [p2];
        array [p2] = array [p1] - array [p2];
        array [p1] = array [p1] - array [p2];
    }

}
