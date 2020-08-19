package ex0;
//在一条街上有n个卖菜的商店，按1至n的顺序排成一排，这些商店都卖一种蔬菜。
//　　第一天，每个商店都自己定了一个价格。店主们希望自己的菜价和其他商店的一致，第二天，
// 每一家商店都会根据他自己和相邻商店的价格调整自己的价格。具体的，
// 每家商店都会将第二天的菜价设置为自己和相邻商店第一天菜价的平均值（用去尾法取整）。
//　　注意，编号为1的商店只有一个相邻的商店2，编号为n的商店只有一个相邻的商店n-1，
// 其他编号为i的商店有两个相邻的商店i-1和i+1。

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


//import java.util.Scanner; public class 卖菜 {
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

