package dataStructure.sort;

/**
 * @program: exercise
 * @description: 希尔排序
 * @author: Jojo.Lee
 * @create: 2019-08-15 22:38
 **/

//排序动图演示 https://www.cnblogs.com/luomeng/p/10592830.html
// 代码   https://blog.csdn.net/qq_28081081/article/details/80598960
public class ShellSort {
    public void sort(int[] ins){
        int n = ins.length;
        int gap = n/2;
        while(gap > 0){
            for(int j = gap; j < n; j++){
                int i=j;
                //这层循环是比较步长为gap的两数，若满足条件交换之后，若i-gap的gap步之前还有数，还要和i-gep之前的i-2*gap两个元素比较
                while(i >= gap && ins[i-gap] > ins[i]){
                    int temp = ins[i-gap]+ins[i];
                    ins[i-gap] = temp-ins[i-gap];
                    ins[i] = temp-ins[i-gap];
                    i -= gap;
                }
            }
            gap = gap/2;
        }
    }
}
