package ţ�ͽ�ָoffer�����;


/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-21 10:31
 **/
public class ������̨�� {
    public int JumpFloor(int target) {
        if (target<=0) return 0;
        if (target==1) return 1;
        int a = 1;
        int b = 2;
        while (target>1){
            b = a + b;
            a = b - a;
            target--;
        }
        return a;
    }
}
