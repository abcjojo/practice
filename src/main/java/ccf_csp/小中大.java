package ccf_csp;

import java.util.Scanner;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-09-14 11:04
 **/


import java.util.Arrays;


public class С�д� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String str = sc.nextLine();
            int j = 0;
            while(str.indexOf("/")!=-1 || str.indexOf("x")!=-1) {		//��Ϊ�˳����ȼ��ߣ��������ȶ����е�'x'��'/'���д���
                if(str.indexOf("/")!=-1 && str.indexOf("x")!=-1)    //�˳�����
                    j = Math.min(str.indexOf("/"),str.indexOf("x"));	//�˳�ͬ���𣬴�����˳����㣬˭��ǰ����˭
                else if(str.indexOf("/")!=-1 && str.indexOf("x")==-1)    //ֻ�г�û�г�
                    j = str.indexOf("/");
                else if(str.indexOf("/")==-1 && str.indexOf("x")!=-1)    //ֻ�г�
                    j = str.indexOf("x");
                if(j!=-1) {												//���ҵ�һ���˺Ż���һ�����ŵ�ʱ��
                    String tmp1 = "";
                    int k = 1;
                    while(j-k>=0 && str.charAt(j-k)>='0' && str.charAt(j-k)<='9') {		//�ҵ�����ǰ�������j-k��Ϊ��ֹ������-1Խ��
                        tmp1 = str.charAt(j-k)+tmp1;
                        k++;
                    }
                    String tmp2 = "";
                    k = 1;
                    while(j+k<str.length() && str.charAt(j+k)>='0' && str.charAt(j+k)<='9') {	//�ҵ����ź��������j+k��Ϊ��ֹ������str.length()Խ��
                        tmp2 += str.charAt(j+k);
                        k++;
                    }
                    //�ü���Ľ���滻ԭ���˷����߳���������
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
            //������Ĳ�����ɺ�ʣ�µ�ֻ�мӼ������㣬���ȼ�ͬ��˳�����㼴�ɡ�
            int tmp = 0;
            int Sum = 0;
            char f = '+';		//��ΪSum=0����һ��������Sumһ���Ǽӵ�һ���������������fΪ'+'
            for(j=0;j<str.length();j++) {
                if(str.charAt(j)>='0' && str.charAt(j)<='9') {
                    tmp = tmp*10 + (str.charAt(j)-'0');
                }
                else {	//���ҵ���һ�����ŵ�ʱ�������һ�����ŵļӼ�����Ȼ�������ҵ������滻ԭ����
                    if(f == '+')
                        Sum += tmp;
                    else
                        Sum -= tmp;
                    f = str.charAt(j);
                    tmp = 0;
                }
                if(j==str.length()-1) {		//Sum +��-���һ����
                    if(f == '+')
                        Sum += tmp;
                    else
                        Sum -= tmp;
                }
            }
            //������
            if(Sum == 24) {
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }
    }
}

