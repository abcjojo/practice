package ţ�ͽ�ָoffer�����.ţ�ͽ�ָoffer�����;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-26 18:43
 **/
public class ������1���ֵĴ��� {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n < 0) return 0;
        int count=0;
        while(n > 0){
            String str = String .valueOf(n);
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++){
                if (chars[i] == '1'){
                    count++;
                }
            }
            n--;
        }
        return count;
    }
}
