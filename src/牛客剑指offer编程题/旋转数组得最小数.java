package ţ�ͽ�ָoffer�����;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-21 10:01
 **/
public class ��ת�������С�� {
    public int minNumberInRotateArray(int [] array) {
        if (array.length==0) return 0;
        int i=0;
        while (array[i]<=array[i+1]){
            i++;
        }
//        resver(array,0,i);
//        resver(array,i+1, array.length-1);
//        resver(array,0,array.length);

        //ֱ���ҵ������������е���С�����ɣ����跴ת���齲���飬��ɷǵݼ������������Сֵ
        return array[i+1];
    }
//    public void resver(int[] array, int start, int end){
//        while(start<end){
//            int temp = array[start];
//            array[start] = array[end];
//            array[end] = temp;
//            start++;
//            end--;
//        }
//    }
}
