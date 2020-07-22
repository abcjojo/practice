package ex0;
//问题描述
//　　给定n个数，请找出其中相差（差的绝对值）最小的两个数，输出它们的差值的绝对值。
//输入格式
//　　输入第一行包含一个整数n。
//　　第二行包含n个正整数，相邻整数之间使用一个空格分隔。
//输出格式
//　　输出一个整数，表示答案。
//样例输入
//5
//1 5 4 8 20
//样例输出
//1
//样例说明
//　　相差最小的两个数是5和4，它们之间的差值是1。
//样例输入
//5
//9 3 6 1 3
//样例输出
//0
//样例说明
//　　有两个相同的数3，它们之间的差值是0.
//数据规模和约定
//　　对于所有评测用例，2 ≤ n ≤ 1000，每个给定的整数都是不超过10000的正整数。
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
