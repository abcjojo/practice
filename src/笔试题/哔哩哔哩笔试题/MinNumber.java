package ������.��������������;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @program: exercise
 * @description: �����С����
 * @author: Jojo.Lee
 * @create: 2019-08-20 19:52
 **/
public class MinNumber {

        /**
         * Q68����һ�����������飬���������������ų�һ������������ų���������������С��һ����
         * ������������{32,  321}����������������ųɵ���С����32132����������������㷨����֤�����㷨��
         */
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            String inputString = in.next();
            String[] stringArray = inputString.split(",");
            int[] nums=new int[stringArray.length];
            for(int i=0;i<stringArray.length;i++){
                nums[i]=Integer.parseInt(stringArray[i]);
            }
            in.close();
            int[][] val={nums};

//            int[][] val={
//                    {32,321},
//                    {532,45,78},
//                    {2,23,231},
//                    {2,3,1},
//            };
            for (int [] x : val){
                String result=minNumFromIntArray(x);
                System.out.println(result);
                AuxClass minStr=new AuxClass();
                minNumFromIntArray2(x,0,x.length-1,minStr);
                System.out.println(minStr.str);
            }

        }

        public static String minNumFromIntArray(int[] x){
            String[] strs=stringsOf(x);
            Arrays.sort(strs,new Comparator<String>(){
                public int compare(String o1, String o2) {
                    return (o1+o2).compareTo(o2+o1);
                }
            });
            StringBuilder sb=new StringBuilder();
            for(String each:strs){
                sb.append(each);
            }
            return sb.toString();
        }

        //int[] to String[].For comparing.
        public static String[] stringsOf(int[] x){
            int len=x.length;
            String[] strs=new String[len];
            for(int i=0;i<len;i++){
                strs[i]=""+x[i];
            }
            return strs;
        }

        /*solution 2
         * get all the permutations.
         * find the min.
         * Of course we use String instead of Big Integer.
         */
        public static void minNumFromIntArray2(int[] x,int first,int last,AuxClass minStr){
            if(first==last){
                StringBuilder sb=new StringBuilder();
                for(int each:x){
                    sb.append(each);
                }
                if(minStr.str==null){
                    minStr.str=sb.toString();
                }else{
                    if(minStr.str.compareTo(sb.toString())>0){
                        minStr.str=sb.toString();
                    }
                }
                return;
            }
            for(int i=first;i<=last;i++){
                swap(x,first,i);
                minNumFromIntArray2(x,first+1,last,minStr);
                swap(x,first,i);
            }
        }
        public static void swap(int[] x,int i,int j){
            int temp=x[i];
            x[i]=x[j];
            x[j]=temp;
        }

        /*
         * when you use 'String' instead of inner class,you get 'null' all the time
         */
        static class AuxClass{
            String str;
        }


}
