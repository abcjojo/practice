package heapSort;

import org.junit.Test;
//�ο���ַhttps://www.cnblogs.com/seniusen/p/10023172.html
public class Heap {
    private int [] a;//����a���洢��,���±� 1 ��ʼ�洢����
    private int n;//�����С�����ѿ��Դ洢���ݵĸ���
    private int count;//�����Ѿ��洢������
    public Heap(int capicity){
        a = new int[capicity+10];
        n = capicity;
        count = 0;
    }
    public void insert(int data){
        if (count>n) return;//������
        ++count;
        a[count] = data;
        int i = count;
        while (i/2 > 0 && a[i] > a[i/2]) { // �������϶ѻ�
            swap(a, i, i/2); // swap() �������ã������±�Ϊ i �� i/2 ������Ԫ��
            i = i/2;
        }
    }
    public void removeMax(){
        if (count == 0) return ;//����û������
        a[1] = a[count];

    }
    public void heapify(int [] a ,int n, int i){
        while (true) {
            int maxPos = i;

        }
    }

    public void swap(int [] a, int p ,int q){//��������a�е��±�p��q��ֵ
        a[p] = a[p]+a[q];
        a[q] = a[p]-a[q];
        a[p] = a[p]-a[q];
    }
    @Test
    public void test(){
        int a[] ={3,5,7};
        int p=0;
        int q=1;
        swap(a,p,q);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
