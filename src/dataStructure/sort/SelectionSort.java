package dataStructure.sort;

/**
 * @program: exercise
 * @description: ѡ������  ˼�룺ʹ������ѭ������ѭ�������ߣ���ѭ����i+1��ʼ���ҵ���С������a[i]������
 * �������򲻰������ĺõ�i֮ǰ����
 * @author: Jojo.Lee
 * @create: 2019-08-11 21:30
 **/
public class SelectionSort {

    public void sort(int [] array){
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]>array[j]){//�������ݣ���Ӱ���±������
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

}
