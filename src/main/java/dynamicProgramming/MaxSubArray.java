package dynamicProgramming;

/**
 * @program: exercise
 * @description: ��̬�滮����������������
 * @author: Jojo.Lee
 * @create: 2019-08-19 22:08
 **/
public class MaxSubArray {

        public static void main(String[] args) {
            int[] a=new int[]{1,-2,4,8,-4,7,-1,-5};
            System.out.println(MaximumSubArray(a));
        }
        public static int MaximumSubArray(int[] a){
            int MaxSumSub=Integer.MIN_VALUE; //���ֵ
            int start=0,end=0; //���������Ŀ�ʼ�����
            int[] dp=new int[a.length]; //��̬�滮������
            dp[0]=a[0];
            for(int i=1;i<a.length;i++){
                if(dp[i-1]<=0){
                    dp[i]=a[i];
                    start=i;
                }else{
                    dp[i]=dp[i-1]+a[i];
                }
                if(dp[i]>MaxSumSub){
                    MaxSumSub=dp[i];
                    end=i;
                }
            }
            System.out.println(start+","+end);
            return MaxSumSub;
        }
}
