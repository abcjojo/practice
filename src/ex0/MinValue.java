package ex0;
//��������
//��������n���������ҳ���������ľ���ֵ����С����������������ǵĲ�ֵ�ľ���ֵ��
//�����ʽ
//���������һ�а���һ������n��
//�����ڶ��а���n������������������֮��ʹ��һ���ո�ָ���
//�����ʽ
//�������һ����������ʾ�𰸡�
//��������
//5
//1 5 4 8 20
//�������
//1
//����˵��
//���������С����������5��4������֮��Ĳ�ֵ��1��
//��������
//5
//9 3 6 1 3
//�������
//0
//����˵��
//������������ͬ����3������֮��Ĳ�ֵ��0.
//���ݹ�ģ��Լ��
//����������������������2 �� n �� 1000��ÿ���������������ǲ�����10000����������
import java.util.Arrays;
import java.util.Scanner;
public class MinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=10000,s0=0;
        int n=sc.nextInt();
        while (sc.hasNext()){
            int a[]=new int [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            for (int i=0;i<n-1;i++){
                s0=Math.abs(a[i+1]-a[i]);
                if (s0<=s){
                    s=s0;
                }
            }
            System.out.println(s);
        }

    }
}
