package ţ�ͽ�ָoffer�����.ţ�ͽ�ָoffer�����;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-25 11:25
 **/
public class ������ֻ����һ�ε��� {
    //num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
    //��num1[0],num2[0]����Ϊ���ؽ��
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Map<Integer,Integer> map = new HashMap();
        //������Ԫ�ش��hashmap��
        for (int i = 0; i < array.length; i++){
            //���key�Ƿ��Ѿ����ֹ�
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else{
                map.put(array[i],1);
            }
        }
        int count = 0;
        //�ҵ�ֻ���ֹ�һ�ε�Ԫ��
        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            if ((int)entry.getValue()==1 && count==0){
                num1[0] = (int)entry.getKey();
                count++;
            }
            if((int)entry.getValue()==1 && count==1){
                num2[0] = (int)entry.getKey();
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2,4,3,6,3,2,5,5};
        int[]  num0 = new int[1];
        int[]  num1 = new int[1];

        ������ֻ����һ�ε��� arr  = new ������ֻ����һ�ε���();
        arr.FindNumsAppearOnce(array,num0,num1);
        System.out.println(num0[0]);
        System.out.println(num1[0]);
    }
}









