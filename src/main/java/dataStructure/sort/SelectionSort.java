package dataStructure.sort;

/**
 * @program: exercise
 * @description: 选择排序  思想：使用两层循环，外循环正常走，内循环从i+1开始，找到最小的数和a[i]交换，
 * 下趟排序不包括已拍好的i之前的数
 * @author: Jojo.Lee
 * @create: 2019-08-11 21:30
 **/
public class SelectionSort {

    public void sort(int [] array){
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]>array[j]){//交换数据，不影响下标的运算
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

}
