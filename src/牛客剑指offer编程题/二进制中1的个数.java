package ţ�ͽ�ָoffer�����;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-21 19:39
 **/
public class ��������1�ĸ��� {

    public int NumberOf1(int n) {
        int count = 0;
        while(n!=0){
            count++;
            n = n&(n-1);
        }
        return count;
    }

}
