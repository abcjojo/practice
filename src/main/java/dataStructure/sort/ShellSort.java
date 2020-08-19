package dataStructure.sort;

/**
 * @program: exercise
 * @description: ϣ������
 * @author: Jojo.Lee
 * @create: 2019-08-15 22:38
 **/

//����ͼ��ʾ https://www.cnblogs.com/luomeng/p/10592830.html
// ����   https://blog.csdn.net/qq_28081081/article/details/80598960
public class ShellSort {
    public void sort(int[] ins){
        int n = ins.length;
        int gap = n/2;
        while(gap > 0){
            for(int j = gap; j < n; j++){
                int i=j;
                //���ѭ���ǱȽϲ���Ϊgap����������������������֮����i-gap��gap��֮ǰ����������Ҫ��i-gep֮ǰ��i-2*gap����Ԫ�رȽ�
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
