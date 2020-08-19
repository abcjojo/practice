package dataStructure.sort;

/**
 * @program: exercise
 * @description: ð������  ˼�룻����ѭ������������ߣ��ڲ�ÿ���ҵ�����Ԫ�ط������
 * @author: Jojo.Lee
 * @create: 2019-08-11 21:48
 **/
public class BubbleSort {
    public void bubbleSort(int [] array){
        for(int i=0; i<array.length-1; i++){
            boolean flag = false;
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }
}
