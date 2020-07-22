package ccf_csp;

import java.util.Scanner;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-09-14 11:04
 **/


import java.util.Arrays;


public class 小中大 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String str = sc.nextLine();
            int j = 0;
            while(str.indexOf("/")!=-1 || str.indexOf("x")!=-1) {		//因为乘除优先级高，所以首先对所有的'x'和'/'进行处理
                if(str.indexOf("/")!=-1 && str.indexOf("x")!=-1)    //乘除都有
                    j = Math.min(str.indexOf("/"),str.indexOf("x"));	//乘除同级别，从左到右顺序计算，谁在前先算谁
                else if(str.indexOf("/")!=-1 && str.indexOf("x")==-1)    //只有除没有乘
                    j = str.indexOf("/");
                else if(str.indexOf("/")==-1 && str.indexOf("x")!=-1)    //只有乘
                    j = str.indexOf("x");
                if(j!=-1) {												//在找到一个乘号或者一个除号的时候
                    String tmp1 = "";
                    int k = 1;
                    while(j-k>=0 && str.charAt(j-k)>='0' && str.charAt(j-k)<='9') {		//找到符号前面的数，j-k是为防止检索到-1越界
                        tmp1 = str.charAt(j-k)+tmp1;
                        k++;
                    }
                    String tmp2 = "";
                    k = 1;
                    while(j+k<str.length() && str.charAt(j+k)>='0' && str.charAt(j+k)<='9') {	//找到符号后面的数，j+k是为防止检索到str.length()越界
                        tmp2 += str.charAt(j+k);
                        k++;
                    }
                    //用计算的结果替换原来乘法或者除法的运算
                    if(str.charAt(j)=='/') {
                        String restr = (Integer.parseInt(tmp1) / Integer.parseInt(tmp2))+"";
                        str = str.replaceAll(tmp1+str.charAt(j)+tmp2, restr);
                    }
                    else if(str.charAt(j)=='x') {
                        String restr = (Integer.parseInt(tmp1) * Integer.parseInt(tmp2))+"";
                        str = str.replaceAll(tmp1+str.charAt(j)+tmp2, restr);
                    }

                }
            }
            //在上面的操作完成后剩下得只有加减法运算，优先级同级顺序运算即可。
            int tmp = 0;
            int Sum = 0;
            char f = '+';		//因为Sum=0，第一个操作是Sum一定是加第一个数，所以设符号f为'+'
            for(j=0;j<str.length();j++) {
                if(str.charAt(j)>='0' && str.charAt(j)<='9') {
                    tmp = tmp*10 + (str.charAt(j)-'0');
                }
                else {	//在找到下一个符号的时候完成上一个符号的加减操作然后用新找到符号替换原符号
                    if(f == '+')
                        Sum += tmp;
                    else
                        Sum -= tmp;
                    f = str.charAt(j);
                    tmp = 0;
                }
                if(j==str.length()-1) {		//Sum +或-最后一个数
                    if(f == '+')
                        Sum += tmp;
                    else
                        Sum -= tmp;
                }
            }
            //输出结果
            if(Sum == 24) {
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }
    }
}

