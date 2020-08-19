package ex0;
//小H和小W来到了一条街上，两人分开买菜，他们买菜的过程可以描述为，
// 去店里买一些菜然后去旁边的一个广场把菜装上车，两人都要买n种菜，所以也都要装n次车。
// 具体的，对于小H来说有n个不相交的时间段[a1,b1],[a2,b2]...[an,bn]在装车，
// 对于小W来说有n个不相交的时间段[c1,d1],[c2,d2]...[cn,dn]在装车。
// 其中，一个时间段[s, t]表示的是从时刻s到时刻t这段时间，时长为t-s。
//由于他们是好朋友，他们都在广场上装车的时候会聊天，他们想知道他们可以聊多长时间。
//样例输入
//4
//1 3
//5 6
//9 13
//14 15

//2 4
//5 7
//10 11
//13 14
//样例输出
//3
//　对于所有的评测用例，1 ≤ n ≤ 2000, ai < bi < ai+1，ci < di < ci+1,
// 对于所有的i(1 ≤ i ≤ n)有，1 ≤ ai, bi, ci, di ≤ 1000000。
import java.util.Scanner;

public class BuyVeg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int [] t=new int [10000];
        for(int i=0;i<2*n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            for (int j=a;j<b;j++){
                t[j]++;
            }
        }
        for(int i:t){
            if (i>1){
                count++;
            }
        }
        System.out.println(count);
    }
}
