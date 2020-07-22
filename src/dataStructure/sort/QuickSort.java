package dataStructure.sort;

/**
 * @program: exercise
 * @description: 快排
 * @author: Jojo.Lee
 * @create: 2019-08-15 16:48
 **/
public class QuickSort {
    public void sort(int [] array, int start, int end){
        if(start>=end) return ;
        int left = start+1;
        int right = end;
        //保存基准值
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
        //交换当前基准值和左面子数组最右元素的位置
        int temp = array[left];
        array[left] = key;
        array[start] = temp;
        sort(array,start,left-1);
        sort(array,left+1,end);

    }
}
