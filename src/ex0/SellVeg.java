package ex0;
//��һ��������n�����˵��̵꣬��1��n��˳���ų�һ�ţ���Щ�̵궼��һ���߲ˡ�
//������һ�죬ÿ���̵궼�Լ�����һ���۸񡣵�����ϣ���Լ��Ĳ˼ۺ������̵��һ�£��ڶ��죬
// ÿһ���̵궼��������Լ��������̵�ļ۸�����Լ��ļ۸񡣾���ģ�
// ÿ���̵궼�Ὣ�ڶ���Ĳ˼�����Ϊ�Լ��������̵��һ��˼۵�ƽ��ֵ����ȥβ��ȡ������
//����ע�⣬���Ϊ1���̵�ֻ��һ�����ڵ��̵�2�����Ϊn���̵�ֻ��һ�����ڵ��̵�n-1��
// �������Ϊi���̵����������ڵ��̵�i-1��i+1��

import java.util.Scanner;

public class SellVeg {
    public void sell(int [] a){
        int b[]=a;
        b[0]=(int)(Math.floor((a[0]+a[1])/2));
        b[a.length-1]=(int)(Math.floor((a[a.length-1]+a[a.length-2])/2));
        for (int i=1;i<a.length-1;i++){
            b[i]=(int)(Math.floor((a[i]+a[i-1]+a[i+1])/3));
        }
        for(int j=0;j<b.length;j++){
            System.out.print(b[j]+" ");
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a []=new int [n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        new SellVeg().sell(a);
    }
}


//import java.util.Scanner; public class ���� {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int n = input.nextInt();
// int[] li = new int[n];
// int[] newLi = new int[n];
// for (int i = 0; i < li.length; i++)
// li[i] = input.nextInt();
// for (int i = 0; i < li.length; i++) {
// if (i == 0){ newLi[i] = (li[i] + li[i + 1]) / 2; }
// else if (i == li.length - 1) { newLi[i] = (li[i] + li[i - 1]) / 2; }
// else { newLi[i] = (li[i - 1] + li[i] + li[i + 1]) / 3; } }
// for (int i : newLi) System.out.print(i + " "); } }

