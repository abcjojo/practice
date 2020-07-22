package leetcode.sort;

import org.junit.Test;

/**
 * @program: exercise
 * @description: �鲢����
 * @author: Jojo.Lee
 * @create: 2019-07-30 15:07
 **/

//�ο���ַ  ��  https://blog.csdn.net/qq_36442947/article/details/81612870
public class MergeSort {
    //��·�鲢�㷨�������ź���������кϲ�Ϊһ��������
    public void merge(int []a,int left,int mid,int right){
        int []tmp=new int[a.length];//��������
        int p1=left,p2=mid+1,k=left;//p1��p2�Ǽ��ָ�룬k�Ǵ��ָ��

        while(p1<=mid && p2<=right){
            if(a[p1]<=a[p2])
                tmp[k++]=a[p1++];
            else
                tmp[k++]=a[p2++];
        }

        while(p1<=mid) tmp[k++]=a[p1++];//�����һ������δ����ֱ꣬�ӽ���������Ԫ�ؼӵ��ϲ���������
        while(p2<=right) tmp[k++]=a[p2++];//ͬ��

        //���ƻ�ԭ����
        for (int i = left; i <=right; i++)
            a[i]=tmp[i];
    }

    public void mergeSort(int [] a,int start,int end){
        if(start<end){//����������ֻ��һ��Ԫ��ʱ�����ݹ�
            int mid=(start+end)/2;//����������
            mergeSort(a, start, mid);//����������н��еݹ�����
            mergeSort(a, mid+1, end);//���Ҳ������н��еݹ�����
            merge(a, start, mid, end);//�ϲ�
        }
    }

    @Test
    public void test(){
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        mergeSort(a, 0, a.length-1);
        System.out.println("�ź�������飺");
        for (int e : a)
            System.out.print(e+" ");
    }
}