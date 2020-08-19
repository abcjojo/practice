
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;


//public class ShouSub {
//
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] a = new int[n*n];
//        for (int i = 0; i < n*n ; i++) a[i] = sc.nextInt();
//        int c[][]= new int[n][n];
//        int count =0;
//        for (int i = 0; i < n ; i++){
//            for (int j = 0; j < n ; j++){
//                c[i][j] = a[count];
//                count++;
//            }
//        }
//
//        List<List<Integer>> main=new ArrayList<>();
//        for(int i=0;i<c.length;i++)
//        {
//            List<Integer> heng=new ArrayList<>();
//            for(int j=0;j<c[0].length;j++)
//            {
//                if(j!=0)
//                    heng.add(c[i][j]+heng.get(j-1));
//                else heng.add(c[i][j]);
//            }
//            if(i!=0)
//                main.add(addList(heng,main.get(i-1)));
//            else main.add(heng);
//        }
//        int max=main.get(0).get(0);
//        for(int z=0;z<main.size();z++)
//        {
//            int temp=Collections.max(main.get(z));
//            if(max<temp)
//            {
//                max=temp;
//            }
//        }
//        for(int i1=0;i1<main.size();i1++)
//        {
//            for(int j1=0;j1<main.get(0).size();j1++)
//            {
//                for(int i2=i1+1;i2<main.size();i2++)
//                {
//                    for(int j2=j1+1;j2<main.get(0).size();j2++)
//                    {
//                        int g_max=0;
//                        if(i1!=0&&j1!=0)
//                        {
//                            g_max=(main.get(i2).get(j2)+main.get(i1-1).get(j1-1)-main.get(i2).get(j1-1)-main.get(i1-1).get(j2));
//
//                        }
//                        else if(i1!=0)
//                        {
//                            g_max=(main.get(i2).get(j2)-main.get(i1-1).get(j2));
//                        }
//                        else if(j1!=0)
//                        {
//                            g_max=(main.get(i2).get(j2)-main.get(i2).get(j1-1));
//                        }
//                        if(max<g_max)
//                        {
//                            max=g_max;
//                        }
//                    }
//                }
//            }
//        }
//
//        System.out.println(max);
//    }
//    public static List<Integer> addList(List<Integer> a,List<Integer> b)
//    {
//        List<Integer> sum=new ArrayList<Integer>();
//        for(int i=0;i<a.size();i++)
//        {
//            sum.add(a.get(i)+b.get(i));
//        }
//
//        return sum;
//    }
//
//}
