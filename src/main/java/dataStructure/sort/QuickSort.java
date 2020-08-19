package dataStructure.sort;

/**
 * @program: exercise
 * @description: ����
 * @author: Jojo.Lee
 * @create: 2019-08-15 16:48
 **/
public class QuickSort {
    public void sort(int [] array, int start, int end){
        if(start>=end) return ;
        int left = start+1;
        int right = end;
        //�����׼ֵ
        int key = array[start];
        while(left<right){
            while (array[right]>key && left<right)
                right--;
            while (array[left]< key && left<right)
                left++;
            if(left<right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        //������ǰ��׼ֵ����������������Ԫ�ص�λ��
        int temp = array[left];
        array[left] = key;
        array[start] = temp;
        sort(array,start,left-1);
        sort(array,left+1,end);

    }
}
