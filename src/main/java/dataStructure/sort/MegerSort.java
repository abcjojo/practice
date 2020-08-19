package dataStructure.sort;

/**
 * @program: exercise
 * @description: �鲢
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
        //����ָ�룬ָ��ǰ�������������ͷ��
        int p1 = start, p2 = mid+1;
        //������ʱ�����ͷָ��
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
