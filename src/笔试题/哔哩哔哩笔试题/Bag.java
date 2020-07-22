package ������.��������������;

import java.util.Scanner;

/**
 * @program: exercise
 * @description: ��������
 * @author: Jojo.Lee
 * @create: 2019-08-20 20:01
 **/
public class Bag {
    public static int backPackII(int m, int[] A, int[] V) {
        // 1.����״̬����dp[i][j]��ʾ��0..i����Ʒ�в�����j�ص�����µı���������ֵ
        int[][] dp = new int[A.length + 1][m + 1];
        // 2.״̬ת�Ʒ��̣�dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-A[i-1]] + V[i-1])
        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = dp[i-1][j];
                if (j >= A[i-1]) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-A[i-1]] + V[i-1]);
                }
            }
        }
        return dp[A.length][m];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int v = in.nextInt();
        int [] wight =new int[w];
        int [] value =new int[v];
        for(int i=0;i<w;i++){
            wight[i] = in.nextInt();
        }
        for(int i=0;i<w;i++){
            value[i] = in.nextInt();
        }
        in.close();
        System.out.println(backPackII(w,wight,value));
    }
}
