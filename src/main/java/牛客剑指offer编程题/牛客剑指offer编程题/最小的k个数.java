package ţ�ͽ�ָoffer�����.ţ�ͽ�ָoffer�����;

import java.util.ArrayList;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-09-13 10:23
 **/
public class ��С��k���� {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>(k);
        if (input.length < k) return null;
        for (int i = 0; i < k; i++){
            list.add(input[i]);
        }

        return list;
    }

    public static void main(String[] args) {
        String str = "asdf";
        char a=str.charAt(3);
        System.out.println(a);
    }
}
