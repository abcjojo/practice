package heapSort;

import org.junit.Test;
//参考网址https://www.cnblogs.com/seniusen/p/10023172.html
public class Heap {
    private int [] a;//数组a，存储堆,从下标 1 开始存储数据
    private int n;//数组大小，即堆可以存储数据的个数
    private int count;//堆中已经存储的数据
    public Heap(int capicity){
        a = new int[capicity+10];
        n = capicity;
        count = 0;
    }
    public void insert(int data){
        if (count>n) return;//堆满了
        ++count;
        a[count] = data;
        int i = count;
        while (i/2 > 0 && a[i] > a[i/2]) { // 自下往上堆化
            swap(a, i, i/2); // swap() 函数作用：交换下标为 i 和 i/2 的两个元素
            i = i/2;
        }
    }
    public void removeMax(){
        if (count == 0) return ;//堆中没有数据
        a[1] = a[count];

    }
    public void heapify(int [] a ,int n, int i){
        while (true) {
            int maxPos = i;

        }
    }

    public void swap(int [] a, int p ,int q){//交换数组a中的下标p，q的值
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
