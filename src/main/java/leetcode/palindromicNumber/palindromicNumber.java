//package leetcode.palindromicNumber;
////�ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
////
////ʾ�� 1:
////
////����: 121
////���: true
////ʾ��?2:
////
////����: -121
////���: false
////����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
////ʾ�� 3:
////
////����: 10
////���: false
////����: ���������, Ϊ 01 �����������һ����������
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
//        //�����������ֲ�����������
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
//    //�ж������λ��
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
