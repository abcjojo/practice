package dataStructure.sort;

/**
 * @program: exercise
 * @description: 归并
 * @author: Jojo.Lee
 * @create: 2019-08-12 12:34
 **/
public class MegerSort {

    public void megerSort(int [] array,int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            megerSort(array,start,mid);
            megerSort(array,mid+1,end);
            meger(array, start, mid, end);
        }
    }
    public void meger(int [] array, int start, int mid, int end){
        //定义指针，指向前后两个子数组的头部
        int p1 = start, p2 = mid+1;
        //保存临时数组的头指针
        int key = start;
        int [] temp = new int[array.length];

        while(p1<=mid && p2<=end){
            if (array[p1]<=array[p2]){
                temp[key++] = array[p1++];
            }else{
                temp[key++] = array[p2++];
            }
        }

        while(p1<=mid) temp[key++] = array[p1++];
        while(p2<=end) temp[key++] = array[p2++];

        for (int i=start; i<=end; i++){
            array[i] = temp[i];
        }
    }
}
