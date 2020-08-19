//package leetcode.palindromicNumber;
////判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
////
////示例 1:
////
////输入: 121
////输出: true
////示例?2:
////
////输入: -121
////输出: false
////解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
////示例 3:
////
////输入: 10
////输出: false
////解释: 从右向左读, 为 01 。因此它不是一个回文数。
//
//import org.junit.Test;
//
//import java.util.Scanner;
//
//public class palindromicNumber {
//    public static void main(String[] args) {
//
//
//    }
//    @Test
//    public boolean show(){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean flag = false;
//        //sc.close();
//        if (n<0){
//            //System.out.println(flag);
//            return flag;
//        }
//
//        int count = foundN(n);
//        int [] a = new int[count];
//        int m = n;
//        //将输入的数拆分并放入数组中
//        int count1=count;
//        while(count1>0){
//            a[count1-1] = m%10;
//            m=m/10;
//            count1--;
//        }
//        int i = 0;
//        while(i<=count/2){
//            if(a[i]!=a[count-1-i]){
//                //System.out.println(flag);
//                return flag;
//            }
//            i++;
//        }
//        flag=true;
//        //System.out.println(flag);
//        return flag;
//    }
//    //判断输入的位数
//    public int foundN(int m){
//        int count = 1;
//        while(m>1){
//            m=m/10;
//            count++;
//        }
//        System.out.println("count:"+count);
//        return count;
//    }
//}
//
//
//
