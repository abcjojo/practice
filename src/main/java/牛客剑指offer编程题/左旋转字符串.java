package ţ�ͽ�ָoffer�����;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2020-02-26 11:18
 **/
public class ����ת�ַ��� {
    public String LeftRotateString(String str,int n) {
        if (n<1)
            return str;
        StringBuffer buffer = new StringBuffer(str);
        StringBuffer buffer1 = new StringBuffer(str);
        StringBuffer buffer2 = new StringBuffer();
        buffer.delete(0,n);
        buffer1.delete(n,str.length());
        buffer2.append(buffer.toString()).append(buffer1.toString());
        return buffer2.toString();
    }

}
